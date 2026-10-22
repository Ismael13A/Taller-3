package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.enterprise.inject.spi.CDI;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

@ApplicationScoped
public class PedidoService {

    @Inject 
    @Named("mail")
    private MailService notificacioncorreo;
    @Inject 
    @Named("sms")
    private SMSService notificacionSMS;

    public void realizar(Pedido pedido) {

        System.out.println("Realizado pedido...");
        System.out.println("" + pedido.getCliente());
        System.out.println("" + pedido.getProducto());
        System.out.println("" + pedido.getTotal());
        System.out.println("" + pedido.getCorreo());

        String cuerpo = "Estimado" + pedido.getCliente() + ", su pedido de" +
                pedido.getProducto() + " por un total de $" + pedido.getTotal() +
                " ha salido con exito";

        // Notificacion del pedido por correo electronico
        this.notificacioncorreo.enviar(pedido.getCorreo(), cuerpo);
       
        // Notificacion de pedido por SMS
        this.notificacionSMS.enviar(pedido.getTelefono(), cuerpo);
    }
}
