import factory.ConexionFactory;
import factory.IConexion;

public class AppFactory {

    public static void main(String[] args) {
        ConexionFactory factory = new ConexionFactory();
        IConexion c = factory.getConexion("Sql Server");
        c.Connect();
        c.Disconnect();
    }
}
