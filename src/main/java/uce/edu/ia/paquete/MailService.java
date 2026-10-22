package uce.edu.ia.paquete;

import io.quarkus.arc.Unremovable;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton 
@Named("mail") 
public class MailService implements Notificacion{


    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando correo a: " +destino);
        System.out.println("Mensaje: "+mensaje);
        System.out.println("Correo enviado con exitó.");
        System.out.println("Fin del envio de correo");
    
    }
}
