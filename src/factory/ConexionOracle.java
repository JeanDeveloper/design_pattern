package factory;

public class ConexionOracle implements IConexion {

    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    @Override
    public void Connect() {
        System.out.println("Se conectó a Oracle");
    }

    @Override
    public void Disconnect() {
        System.out.println("Se desconectó a Oracle");

    }
}
