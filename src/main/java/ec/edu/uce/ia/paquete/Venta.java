package ec.edu.uce.ia.paquete;

public class Venta {

    private Integer numeroventa;
    private String tipoCliente;
    private double monto;
    private double descuento;
    private double total;

    public Venta() {

    }

    public Venta(Integer numeroventa, String tipoCliente, double monto, double descuento, double total) {
        this.numeroventa = numeroventa;
        this.tipoCliente = tipoCliente;
        this.monto = monto;
        this.descuento = descuento;
        this.total = total;
    }

    public Integer getNumeroventa() {
        return numeroventa;
    }

    public void setNumeroventa(Integer numeroventa) {
        this.numeroventa = numeroventa;
    }

    public String getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(String tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

}
