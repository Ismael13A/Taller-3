package uce.edu.ia.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import uce.edu.ia.paquete.Pedido;

@SMS 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + (3))
public class SMSinter {


    @AroundInvoke 
    public Object enviarSMS(InvocationContext context) throws Exception {
        Object result = context.proceed();
        Object[] valores = context.getParameters();
        Pedido pedido = (Pedido) valores[0];
        String cliente = pedido.getCliente();
        System.out.println("-------Enviando SMS al cliente : " + cliente + "------ ");
        return result;
    }

}
