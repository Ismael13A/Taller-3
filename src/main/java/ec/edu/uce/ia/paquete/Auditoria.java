package ec.edu.uce.ia.paquete;

import java.util.UUID;

import jakarta.enterprise.context.Dependent;
import jakarta.inject.Named;

@Dependent
@Named("audi")
public class Auditoria {

    private final String uuid;

    public Auditoria() {
        this.uuid = UUID.randomUUID().toString();
    }

    public void registrar() {
        System.out.println("Instancia ID: " + uuid);
    }

}
