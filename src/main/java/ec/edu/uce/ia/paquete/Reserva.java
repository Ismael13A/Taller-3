package ec.edu.uce.ia.paquete;

public class Reserva {
    private String usuario;
    private String servicio;
    private double costo;
    private String email;

    public Reserva() {
    }

    public Reserva(String usuario, String servicio, double costo, String email) {
        this.usuario = usuario;
        this.servicio = servicio;
        this.costo = costo;
        this.email = email;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
