package arm.principios_SOLID.O_OpenClose;

public class Proveedor extends Usuario{

    private String NIT;
    private String codigoProveedor;
    public Proveedor(String nombre, String apellido, String sexo,
                     String direccion, String correoElectrinico,
                     String telefono, String NIT, String codigoProveedor) {
        super(nombre, apellido, sexo, direccion, correoElectrinico, telefono);
        this.NIT=NIT;
        this.codigoProveedor=codigoProveedor;
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
