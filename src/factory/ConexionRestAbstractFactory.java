package factory;

public class ConexionRestAbstractFactory implements IAbstractFactory{
    @Override
    public IConexion getBD(String motor) {
        return null;
    }

    @Override
    public IConexionRest getRest(String area) {

        if(area == null){
            return new ConexionNoArea();
        }

        if( area.equalsIgnoreCase("Venta") ){
            return new ConexionRestVenta();
        }

        if( area.equalsIgnoreCase("Compra") ){
            return new ConexionRestCompra();
        }
        return new ConexionNoArea();
    }
}
