package ec.edu.uce.ia.paquete;

import java.time.LocalDateTime;

import jakarta.inject.Singleton;

@Singleton
public class NotificarVentaService {

    public void facturaVenta(Integer numeroVenta, String cliente, double monto, double totalcondescuento) {

        System.out.println("-------------------------------");
        System.out.println("FACTURA DE VENTA");
        System.out.println("Numero de venta: " + numeroVenta);
        System.out.println("Tipo de cliente: " + cliente);
        System.out.println("Monto original: $" + monto);
        System.out.println("Total con descuento: $" + totalcondescuento);
        System.out.println("Fecha y hora: " + LocalDateTime.now());
        System.out.println("--------------------------------");
    }

}
