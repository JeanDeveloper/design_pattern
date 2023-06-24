package facade.api;

public class HotelApi {

    public void buscarHoteles(String fechaEntrada, String fechaSalida, String origen, String destino){
        System.out.println("========================");
        System.out.println(" Vuelos encontrados para " + destino  + " Desde " + origen );
        System.out.println(" Fecha ENTRADA: " + fechaEntrada + " Fecha SALIDA: " + fechaSalida);
        System.out.println(" ============================");
    }

}
