package ec.edu.uce.ia.paquete;

import jakarta.inject.Singleton;

@Singleton 
public class NotificacionService {
    public void enviarNotificacion(String destinatario, String titulo, String mensaje) {
        System.out.println("Disparando notificación hacia: " + destinatario);
        System.out.println("Título: " + titulo);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("Notificación entregada satisfactoriamente.");
    }
}
