package factory;

public class ConexionVacia implements IConexion{

    @Override
    public void Connect() {
        System.out.println("No se especifico el proveedor");
    }

    @Override
    public void Disconnect() {
        System.out.println("No se especifico el proveedor");

    }
}
