package arm.principios_SOLID.S_singleResponsability;

public class Main {
    public static void main(String[] args){
        ICalculadora calculadora = new Calculadora();
        calculadora.menu();
        String opcion = calculadora.opcion();
        IEjecutar operar = CalculadoraFactory.getCalculadora(opcion);
        operar.leer();



    }
}
