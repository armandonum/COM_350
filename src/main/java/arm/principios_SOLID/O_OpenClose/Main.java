package arm.principios_SOLID.O_OpenClose;

public class Main {
    public static void main(String[] args) {

        // agregar usuarios
        Usuario usuario1 = new Administrador("Juan", "Perez",
                "M", "Calle 1", "vajsvha@2", "211212!");

        Usuario usuario2 = new Cliente("Maria", "Lopez",
                "F", "Calle 2", "vajsvha@2", "211212!", 100, "123");

        Usuario usuario3=new Proveedor("Pedro", "Gomez","M", "Calle 3", "vajsvha@2", "211212!", "123", "123");
    }

}
