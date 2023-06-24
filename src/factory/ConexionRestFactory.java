package factory;

public class ConexionRestFactory {

    public IConexionRest getConexion(String area){
        if( area == null){
            return new ConexionNoArea();
        }
        if( area.equalsIgnoreCase("Ventas")){
            return new ConexionRestVenta();
        } else if( area.equalsIgnoreCase("Compras") ){
            return new ConexionRestCompra();
        }

        return new ConexionNoArea();
    }

}
