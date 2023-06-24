package factory;

public class ConexionMySql implements IConexion{
    private String host;
    private String puerto;
    private String usuario;
    private String contrasenia;

    public ConexionMySql(){
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "root";
        this.contrasenia = "contrasenia";
    }

    @Override
    public void Connect() {
        System.out.println("Se conectó a MySql");
    }

    @Override
    public void Disconnect() {
        System.out.println("Se desconectó a MySql");
    }
}
