package uce.edu.ia.paquete;

import jakarta.inject.Named;
import jakarta.inject.Singleton;

@Singleton
@Named("sms") 
public class SMSService implements Notificacion {

    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando SMS a: " + destino);
        System.out.println("Mensaje: " + mensaje);
        System.out.println("SMS enviado con exitó.");
        System.out.println("Fin del envio de SMS");
    }

}
