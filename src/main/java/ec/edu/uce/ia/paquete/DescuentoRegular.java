package ec.edu.uce.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;

@ApplicationScoped
@Named("regular")
public class DescuentoRegular implements CalculadoraDescuento {

    @Override
    public double calcularDescuento(double monto) {
        double total = monto * 0.05;
        return total;
    }

}
