package uce.edu.ia.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ia.paquete.Pedido;

@MedirTiempo 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + (4))
public class MailInter {


    @AroundInvoke 
    public Object enviarMail(InvocationContext context) throws Exception {
        Object result = context.proceed();

         Object[] valores = context.getParameters();

        Pedido pedido = (Pedido) valores[0];

        String cliente = pedido.getCliente();
        System.out.println("-------Enviando correo al cliente : "+
        cliente+"------ ");

        return result;
    }
}
