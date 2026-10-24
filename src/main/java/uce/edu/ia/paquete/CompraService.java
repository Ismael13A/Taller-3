package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped 
public class CompraService {

    @Inject
    @Named("mail")
    private Notificacion notificacioncorreo;

    public void realizar(Compra compra) {

        System.out.println("Realizado compra...");
        System.out.println("Conmpra realizada para el cliente: " + compra.getCliente());
        System.out.println("Producto: " + compra.getProducto());
        System.out.println("Total: " + compra.getTotal());
        System.out.println("Correo: " + compra.getCorreo());
        System.out.println("Comrpa realizada con exito");

        String cuerpo = "Estimado" + compra.getCliente() + ", su compra de" +
                compra.getProducto() + " por un total de $" + compra.getTotal() +
                " ha sido realizada con exito";

        // Notificacion del pedido por correo electronico
        this.notificacioncorreo.enviar(compra.getCorreo(), cuerpo);
        this.notificacioncorreo.setCantidad(this.notificacioncorreo.getCantidad()+1);
        System.out.println("Cantidad de correos enviados compra: " + this.notificacioncorreo.getCantidad());
        System.out.println("Nombre: " + this.notificacioncorreo.getNombre());
     }

}
