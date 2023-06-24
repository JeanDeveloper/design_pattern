package factory;

public class ConexionFactory {

    public IConexion getConexion(String motor){
        if( motor == null){
            return new ConexionVacia();
        }
        if( motor.equalsIgnoreCase("MySql")){
            return new ConexionMySql();
        } else if( motor.equalsIgnoreCase("Oracle")  ){
            return new ConexionOracle();
        }else if( motor.equalsIgnoreCase("Sql Server")){
            return new ConexionSqlServer();
        }

        return new ConexionVacia();
    }
}
