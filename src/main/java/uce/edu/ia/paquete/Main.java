package uce.edu.ia.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main implements QuarkusApplication {

     @Inject 
    private PedidoService pedidoService;

    @Inject 
    private CompraService compraService;
    public static void main(String[] args) {
        
        Quarkus.run(Main.class, args);
        
    }

    @Override 
    public int run(String... args) {

        Pedido pedido = new Pedido("Juan", "laptop", 15000.0, "juan@gmail.com","0997959837");
        pedido.setTelefono("0997959837");
        this.pedidoService.realizar(pedido);

        Compra compra = new Compra("Ismael", "celular", 15000.0, "ismael@gmail.com","0981645998");
        compra.setTelefono("0981645998");
        this.compraService.realizar(compra);
    

        return 0;
    }

    
}
