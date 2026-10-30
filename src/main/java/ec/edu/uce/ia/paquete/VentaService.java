package ec.edu.uce.ia.paquete;

import ec.edu.uce.ia.paquete.interceptors.NotificarVenta;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;

@ApplicationScoped
public class VentaService {

    // Inyeccion por Atributo

    @Inject
    @Named("regular")
    private CalculadoraDescuento descuentoRegular;
    @Inject
    @Named("vip")
    private CalculadoraDescuento descuentoVIP;

    /*
     * // Inyeccion por Constructor
     * private CalculadoraDescuento descuentoRegular;
     * private CalculadoraDescuento descuentoVIP;
     * private Auditoria auditoria;
     * 
     * @Inject
     * public VentaService(
     * 
     * @Named("regular") CalculadoraDescuento descuentoRegular,
     * 
     * @Named("vip") CalculadoraDescuento descuentoVIP,
     * 
     * @Named("audi") Auditoria auditoria) {
     * 
     * this.descuentoRegular = descuentoRegular;
     * this.descuentoVIP = descuentoVIP;
     * this.auditoria = auditoria;
     * }
     */

    public Venta procesarVenta(Integer numeroVenta, String tipoCliente, double monto) {
        double valorDescuento = 0.0;
        double procentaje = 0.0;

        if ("regular".equalsIgnoreCase(tipoCliente)) {
            procentaje = 0.05;
            valorDescuento = descuentoRegular.calcularDescuento(monto);
        } else if ("vip".equalsIgnoreCase(tipoCliente)) {
            procentaje = 0.15;
            valorDescuento = descuentoVIP.calcularDescuento(monto);
        }
        double total = monto - valorDescuento;

        return new Venta(numeroVenta, tipoCliente.toUpperCase(), monto, procentaje, total);

    }
    @NotificarVenta 
    public void realizarVenta(Venta venta) {
        System.out.println("Realizando venta...");
        System.out.println("Venta: " + venta.getNumeroventa());
        System.out.println("Tipo: " + venta.getTipoCliente());
        System.out.println("Monto: $" + venta.getMonto());
        System.out.println("Descuento: " + (int) (venta.getDescuento() * 100) + "%");
        System.out.println("Total: $" + venta.getTotal());
        
    }

}
