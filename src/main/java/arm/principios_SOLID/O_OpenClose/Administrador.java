package arm.principios_SOLID.O_OpenClose;

public class Administrador extends Usuario{

    private String password;
    // rol
    private String rol;

    public Administrador(String nombre, String apellido, String sexo,
                         String direccion, String correoElectrinico,
                         String telefono) {
        super(nombre, apellido, sexo, direccion, correoElectrinico, telefono);

        this.password=password;
        this.rol=rol;
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
