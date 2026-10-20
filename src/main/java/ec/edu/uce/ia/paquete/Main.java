package ec.edu.uce.ia.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain 
public class Main  implements QuarkusApplication {
    @Inject 
    private ReservaService reservaService;

    public static void main(String[] args) {
        
        Quarkus.run(Main.class,args);
      
    }

    @Override
    public int run(String... args)  {
        Reserva reserva = new Reserva("Maria Gomez", "Mantenimiento Preventivo", 45.0, "mariagomez@example.com");
        this.reservaService.procesarReserva(reserva);
        return 0;
    }

}
