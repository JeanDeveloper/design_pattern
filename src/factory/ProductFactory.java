package factory;

public class ProductFactory {

    public static IAbstractFactory getFactory(String factoryType){
        if( factoryType.equalsIgnoreCase("BD") ){
            return new ConexionAbstractFactory();
        }
        if( factoryType.equalsIgnoreCase("REST") ){
            return new ConexionRestAbstractFactory();
        }
        return null;
    }
}
