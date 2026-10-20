package ec.edu.uce.pa;
import ec.edu.uce.pa.reserva.*;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Iniciando sistema de reservas...");
        Reserva reserva = new Reserva("Maria Gomez", "Mantenimiento Preventivo", 45.0, "mariagomez@example.com");
        ReservaService reservaService = new ReservaService();
        reservaService.procesarReserva(reserva);
        System.out.println("Proceso finalizado.");
        reserva = null;
        reservaService = null;
      
    }
}