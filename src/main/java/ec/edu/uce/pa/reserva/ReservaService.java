package ec.edu.uce.pa.reserva;


public class ReservaService {
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
        
        notificacionService.enviarNotificacion(reserva.getEmail(), titulo, mensaje);

        notificacionService = null; // el objeto queda elegible para el recolector (GC)
    }
}