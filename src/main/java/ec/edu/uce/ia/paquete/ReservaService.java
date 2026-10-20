package ec.edu.uce.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped 
public class ReservaService {

    @Inject 
    private NotificacionService notificacionService;
    public void procesarReserva(Reserva reserva) {
        System.out.println("procesando reserva en el sistema.........");
        System.out.println("Reserva registrada a nombre de: " + reserva.getUsuario());
        System.out.println("Servicio contratado: " + reserva.getServicio());
        System.out.println("Costo total: $" + reserva.getCosto());
        System.out.println("Correo de contacto: " + reserva.getEmail());
        System.out.println("Reserva procesada con éxito.");

        NotificacionService notificacionService = new NotificacionService();
        String titulo = "Confirmación de su reserva";
        String mensaje = "Estimado/a " + reserva.getUsuario() + ", su reserva para el servicio de " +
                reserva.getServicio() + " por un valor de $" + reserva.getCosto() +
                " ha sido registrada correctamente.";
        
        this.notificacionService.enviarNotificacion(reserva.getEmail(), titulo, mensaje);

    }
}