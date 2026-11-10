package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import uce.edu.ia.paquete.extensiones.NotificacionExtension;

@ApplicationScoped 
public class CompraService {

    
    public void realizar(Compra compra, NotificacionExtension notificacionExtension) {

        System.out.println("Realizado compra...");
        System.out.println("Conmpra realizada para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Comrpa realizada con exito");

        //Aqui se va a programar el envio de la Notificacion

        notificacionExtension.enviar("Su compra ha sido realizada con exito", compra.getCliente());
        
    }

}
