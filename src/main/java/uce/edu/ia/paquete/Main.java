package uce.edu.ia.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;
import uce.edu.ia.paquete.extensiones.NotificacionExtensionMail;
import uce.edu.ia.paquete.extensiones.NotificacionExtensionSMS;
import uce.edu.ia.paquete.extensiones.NotificacionExtensionWhatsApp;

@QuarkusMain 
public class Main implements QuarkusApplication {

     @Inject 
    private PedidoService pedidoService;

    @Inject 
    private CompraService compraService;

    @Inject 
    private NotificacionExtensionMail notificacionExtensionMail;
    @Inject 
    private NotificacionExtensionSMS notificacionExtensionSMS;
    @Inject 
    private NotificacionExtensionWhatsApp notificacionExtensionWhatsApp;
    public static void main(String[] args) {
        
        Quarkus.run(Main.class, args);
        
    }

    @Override 
    public int run(String... args) {
        System.out.println("Iniciando la aplicacion...");
        Compra compra = new Compra("Maria Almachi", "celular", 800.00, "maria@gmail.com", "099999999");
        compraService.realizar(compra, this.notificacionExtensionMail);
       
        Compra compra1 = new Compra("Kevin Yuquilema", "laptop", 800.00, "kevin@gmail.com", "099999999");
        compraService.realizar(compra1, this.notificacionExtensionSMS);
       
        Compra compra2 = new Compra("Juan Caranqui", "refri", 800.00, "juan@gmail.com", "099999999");
        compraService.realizar(compra2, this.notificacionExtensionWhatsApp);
       
        return 0;
    }

    
}
