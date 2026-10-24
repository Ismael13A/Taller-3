package uce.edu.ia.paquete;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;
import jakarta.inject.Singleton;

//Ambitos y Contextos
//@ApplicationScoped //Su ambito es durante toda la aplicacion, es decir se crea un objeto, una sola instancia de la clase y se comprate entre todos los componentes que la ultilizan
//@RequestScoped //Su ambito es en aplicaciones web durante el Request/peticion HTTTP es decir se crea una isntancai de la clase y se comparte entre todos los componentes que la ultilizan durante el Request/peticion HTTTP
//@SessionScoped //Su ambito es en aplicaciones web durante la Session de usuario es decir se crea una isntancai de la clase y se comparte entre todos los componentes que la ultilizan durante la Session
//@Singleton //Su ambnito es durante toda la aplicacion, es decir se crea un objeto, una sola instancia de la clase y se comprate entre todos los componentes que la ultilizan
//@Dependent //Su ambito es durante la inyeccion de dependencias , es decir cada vez que se inyecte se creara un nuevo objeto.

@Dependent
@Named("mail") 
public class MailService implements Notificacion{

    private Integer cantidad =0;
    private String nombre;


    @Override
    public void enviar(String destino, String mensaje) {
        System.out.println("Enviando correo a: " +destino);
        System.out.println("Mensaje: "+mensaje);
        System.out.println("Correo enviado con exitó.");
        System.out.println("Fin del envio de correo");
    
    }

     public Integer getCantidad() {
        return cantidad;
    }


    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
