package ec.edu.uce.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("vip")
public class DescuentoVIP implements CalculadoraDescuento {

    @Override
    public double calcularDescuento(double monto) {
        double total = monto * 0.15;
        return total;
    }

}
