package arm.principios_SOLID.O_OpenClose;

public class Cliente extends Usuario{
    private int puntos;
    private String codigoCliente;

    public Cliente(String nombre, String apellido,
                   String sexo, String direccion, String correoElectrinico, String telefono,
                   int puntos, String codigoCliente) {
        super(nombre, apellido, sexo, direccion, correoElectrinico, telefono);
        this.puntos = puntos;
        this.codigoCliente = codigoCliente;
    }

    @Override
    public void crear() {

    }

    @Override
    public void editar() {

    }

    @Override
    public void eliminar() {

    }
}
