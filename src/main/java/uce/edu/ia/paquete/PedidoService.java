package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import uce.edu.ia.paquete.interceptors.Auditoria;
import uce.edu.ia.paquete.interceptors.Mail;
import uce.edu.ia.paquete.interceptors.MedirTiempo;
import uce.edu.ia.paquete.interceptors.SMS;

@ApplicationScoped

public class PedidoService {
    
    @SMS 
    @Mail 
    @MedirTiempo
    @Auditoria
    public String realizar(Pedido pedido, String valor1) {

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        System.out.println("Realizado pedido...");
        System.out.println("Pedido realizado para el cliente:" + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realziado con exito");
        return "Pedido realizado exitosamente";
    }
}
