package factory;

public class ConexionSqlServer implements  IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    @Override
    public void Connect() {
        System.out.println("Se conectó a Sql Server");
    }

    @Override
    public void Disconnect() {
        System.out.println("Se conectó a Sql Server");
    }
}
