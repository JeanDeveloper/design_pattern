package factory;

public class ConexionAbstractFactory implements IAbstractFactory {

    @Override
    public IConexion getBD(String motor) {
        if(motor == null){
            return new ConexionVacia();
        }

        if( motor.equalsIgnoreCase("MySql") ){
            return new ConexionMySql();
        }

        if( motor.equalsIgnoreCase("Sql Server") ){
            return new ConexionSqlServer();
        }
        if( motor.equalsIgnoreCase("Oracle") ){
            return new ConexionOracle();
        }
        return new ConexionVacia();
    }

    @Override
    public IConexionRest getRest(String area) {
        return null;
    }
}
