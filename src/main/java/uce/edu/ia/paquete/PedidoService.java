package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import uce.edu.ia.paquete.interceptors.Auditoria;


@ApplicationScoped
public class PedidoService {

    @Auditoria
    public String realizar(Pedido pedido,String valor1) {

        System.out.println("Realizado pedido...");
        System.out.println("Pedido realizado para el cliente:" + pedido.getCliente());
        System.out.println("Producto: " + pedido.getProducto());
        System.out.println("Total: " + pedido.getTotal());
        System.out.println("Correo: " + pedido.getCorreo());
        System.out.println("Pedido realziado con exito");
        return "Pedido realizado exitosamente";
     }
}
