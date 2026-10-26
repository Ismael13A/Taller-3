package ec.edu.uce.ia.paquete;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main implements QuarkusApplication {

    @Inject
    private VentaService ventaService;

    public static void main(String[] args) {
        Quarkus.run(Main.class, args);
    }

    @Override
    public int run(String... args) {

        System.out.println("INICIANDO PROGRAMA DE DESCUENTOS.....");
        Venta venta1 = ventaService.procesarVenta(1, "regular", 100.00);
        ventaService.realizarVenta(venta1);

        Venta venta2 = ventaService.procesarVenta(2, "vip", 200.00);
        ventaService.realizarVenta(venta2);

        Venta venta3 = ventaService.procesarVenta(3, "regular", 300.00);
        ventaService.realizarVenta(venta3);

        Venta venta4 = ventaService.procesarVenta(4, "vip", 500.00);
        ventaService.realizarVenta(venta4);

        return 0;
    }

}
