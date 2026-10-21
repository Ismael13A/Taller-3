package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;

@ApplicationScoped 
public class PedidoService {
/* 
//inyeccion de depdenedcias por atributo
    @Inject
    private MailService mailService;
    */
 
 
  
    //Inyeccion de dependencias por constructor
    private MailService mailService;
    @Inject 
    public PedidoService (MailService mailService){
        this.mailService= mailService;
    }
        
    /* 
    private MailService mailService;
    //Inyeccion de dependencia por setter
    @Inject 
    public void setMailService(MailService mailService) {
        System.out.println("Se esta inyectando el servicio de correo electronico service.");
        this.mailService = mailService;
    }
*/


    public void realizar(Pedido pedido) {
        System.out.println("Realizado pedido...");
        System.out.println("" + pedido.getCliente());
        System.out.println("" + pedido.getProducto());
        System.out.println("" + pedido.getTotal());
        System.out.println("" + pedido.getCorreo());

        String asunto = "Confirmacion de pedido";
        String cuerpo = "Estimado" + pedido.getCliente() + ", su pedido de" +
                pedido.getProducto() + " por un total de $" + pedido.getTotal() +
                " ha salido con exito";

        this.mailService.enviar(pedido.getCorreo(), asunto, cuerpo);

    }
}
