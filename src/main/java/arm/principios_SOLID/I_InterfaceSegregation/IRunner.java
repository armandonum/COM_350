package arm.principios_SOLID.I_InterfaceSegregation;

public interface IRunner {
    int menu();

    int submenu( IPersona obj);

    void ejecutar(int op,IPersona persona);
}
