package arm.principios_SOLID.I_InterfaceSegregation;

import java.util.Arrays;
import java.util.List;

public class Docente implements IDocente{

        private String nombreCompleto;

        private String ci;

        public Docente(String nombreCompleto, String ci) {
            this.nombreCompleto = nombreCompleto;

            this.ci = ci;
        }
        @Override
        public List<String> listaMaterias() {
            return Arrays.asList("Matemáticas", "Física", "Química");
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
