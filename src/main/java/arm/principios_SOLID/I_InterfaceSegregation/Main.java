package arm.principios_SOLID.I_InterfaceSegregation;

public class Main {
    public static void main(String[] args) {
       IRunner runner = new Menu();
         int opcion=runner.menu();
         if(opcion==1){
             IEstudiante estudiante=new Estudiante("123", "Juan","4545451");
             int op=runner.submenu(estudiante);
                runner.ejecutar(op,estudiante);
         }else if(opcion==2) {
             IDocente docente =new Docente("Carlos Montellano","9853131");
             int op=runner.submenu(docente);
             runner.ejecutar(op,docente);
         }
         else if(opcion==3){
             IDirector director =new Director("Franz","Villalpando","9853131");
             int op=runner.submenu(director);
             runner.ejecutar(op,director);
         }
    }
}
