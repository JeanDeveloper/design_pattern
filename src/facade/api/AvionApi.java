package facade.api;

public class AvionApi {

    public void buscarVuelos(String fechaIda, String fechaVuelta, String origen, String destino){
        System.out.println("===============================");
        System.out.println(" Vuelos encontrados para " + destino  + " Desde " + origen );
        System.out.println(" Fecha IDA: " + fechaIda + " Fecha Vuelta: " + fechaVuelta);
        System.out.println(" ============================");
    }



}
