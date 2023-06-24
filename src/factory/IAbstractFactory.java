package factory;

public interface IAbstractFactory {
    IConexion getBD(String motor);
    IConexionRest getRest(String area);

}
