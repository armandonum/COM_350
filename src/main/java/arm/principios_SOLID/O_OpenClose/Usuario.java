package arm.principios_SOLID.O_OpenClose;

public abstract class  Usuario {
    private String nombre;
    private String apellido;
    private String sexo;
    private String direccion;
    private  String correoElectrinico;
    private String telefono;
    public Usuario(String nombre, String apellido, String sexo, String direccion, String correoElectrinico, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.direccion = direccion;
        this.correoElectrinico = correoElectrinico;
        this.telefono = telefono;
    }

    /**
     * @return  un nuevo usuario dependiendo del tipo
     */
    public abstract void crear();

    /*
    * @return retorna un usuario editado
     */
    public abstract void editar();

    /**
     * @return retorna un usuario eliminado
     */
    public abstract void eliminar();
}
