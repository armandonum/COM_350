package arm.principios_SOLID.I_InterfaceSegregation;

import java.util.Scanner;

public class Menu  implements IRunner{
    Scanner in=new Scanner(System.in);
    @Override
    public int menu() {
        System.out.println("ELIGE UNA OPCION");
        System.out.println("1. Estudiante");
        System.out.println("2. Docente");
        System.out.println("3. Director");

       return  in.nextInt();
    }

    @Override
    public int submenu(IPersona persona) {
        System.out.println("1: obtener nombre compleo");
        System.out.println("2: obtener CI");
        if(persona instanceof Estudiante){
            System.out.println("3: obtener CU ");
        }else if(persona instanceof Docente){
            System.out.println("3: obtener lista de materias ");
        }
        return in.nextInt();
    }
    @Override
    public void ejecutar(int op,IPersona persona){
        if(op==1){
            System.out.println("el nombre complete es :"+ persona.obtenerNombreCompleto());

        }else if(op==2){
            System.out.println(" el Ci es : "+persona.obtenerCi());

        }else if(op==3){
            if(persona instanceof Estudiante){
                IEstudiante estudiante = (Estudiante) persona;
                System.out.println("el Cu es : "+ estudiante.obtenerCU());
            }else if(persona instanceof Docente){
                IDocente docente=(Docente) persona;
                System.out.println("la lista de materias es: "+ docente.listaMaterias());
            }else if(persona instanceof Director){
                IDirector director=(Director) persona;
                director.accionDirectiva();
            }
        }
    }


}
