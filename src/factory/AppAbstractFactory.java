package factory;

import factory.IAbstractFactory;
import factory.ProductFactory;

public class AppAbstractFactory {


    public static void main(String[] args) {
        IAbstractFactory DBFactory = ProductFactory.getFactory("BD");
        IConexion cxDB = DBFactory.getBD("Oracle");
        cxDB.Connect();
        IAbstractFactory RESTFactory = ProductFactory.getFactory("REST");
        IConexionRest cxREST = RESTFactory.getRest("Venta");

        cxREST.leerURL("https://www.youtube.com/watch?v=QmE-o5R7ZF4&list=PLvimn1Ins-41Uiugt1WbpyFo1XT1WOquL&index=4");




    }
}
