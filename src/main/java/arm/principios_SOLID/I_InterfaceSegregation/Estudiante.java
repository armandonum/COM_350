package arm.principios_SOLID.I_InterfaceSegregation;

public class Estudiante implements IEstudiante {

        private String cu;
        private String nombreCompleto;
        private String ci;


        public Estudiante(String cu, String nombreCompleto,String ci) {
            this.cu = cu;
            this.nombreCompleto = nombreCompleto;
            this.ci=ci;
        }

        @Override
        public String obtenerCU() {
            return cu;
        }


    @Override
    public String obtenerNombreCompleto() {
        return nombreCompleto;
    }

    @Override
    public String obtenerCi() {
        return ci;
    }
}
