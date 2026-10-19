package ec.edu.uce.pa;
import ec.edu.uce.pa.reserva.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Iniciando sistema de reservas...");

        // Creamos manualmente el objeto de la Reserva con datos adaptados
        Reserva reserva = new Reserva("Maria Gomez", "Mantenimiento Preventivo", 45.0, "mariagomez@example.com");
        
        // Creamos manualmente el objeto de ReservaService
        ReservaService reservaService = new ReservaService(); 
        
        // Ejecutamos el procesamiento de la reserva
        reservaService.procesarReserva(reserva);
        
        // Hacemos que los objetos sean elegibles para el Garbage Collector (GC)
        reserva = null;
        reservaService = null;
        
        System.out.println("Proceso finalizado.");
    }
}