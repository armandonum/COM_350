package arm.principios_SOLID.S_singleResponsability;

public class CalculadoraFactory {
    public static IEjecutar getCalculadora(String operacion){
        switch (operacion){
            case "suma":
                return new SumaRuner();
            case "resta":
                return new RestaRuner();
            case "multiplicacion":
                return new MultiplicacionRuner();
            case "division":
                return new divisionRuner();
            default:
                return null;
        }
    }
}
