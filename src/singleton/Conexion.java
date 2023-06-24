package singleton;

public class Conexion{

    private static Conexion instance;

    private Conexion(){
    }

    public static Conexion getInstance(){
        if(instance == null){
            instance = new Conexion();
        }
        return instance;
    }

    public void Connect(){
        System.out.println("Me conecté a la BD");
    }

    public void Disconnect(){
        System.out.println("Me desconecté a la BD");
    }

}
