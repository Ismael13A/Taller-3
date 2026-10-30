package ec.edu.uce.ia.paquete.interceptors;

import ec.edu.uce.ia.paquete.NotificarVentaService;
import ec.edu.uce.ia.paquete.Venta;
import jakarta.inject.Inject;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@NotificarVenta
@Interceptor 
public class NotificarVentaInterceptor {

    @Inject 
    private NotificarVentaService notificarVentaService;

    @AroundInvoke 
    public Object interceptar(InvocationContext context) throws Exception{
        Object resultado = context.proceed();

        String nombreMetodo = context.getMethod().getName();
        System.out.println("Se esta ejecutando el metodo: " +nombreMetodo);

         Object[] valores = context.getParameters();
         Venta venta = (Venta) valores[0];
         Integer numeroVenta = venta.getNumeroventa();
         String tipoCliente = venta.getTipoCliente();
         double monto = venta.getMonto();
         double totalcondescuento=venta.getTotal();

        this.notificarVentaService.facturaVenta(numeroVenta, tipoCliente, monto, totalcondescuento);
        System.out.println("Factura terminada con exito");
        return resultado;
    }
}
