import singleton.Conexion;

public class AppSingleton {

    public static void main(String[] args) {
        Conexion c = Conexion.getInstance();
        c.Connect();
        c.Disconnect();
    }
}
