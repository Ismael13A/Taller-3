package ec.edu.uce.ia.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;
import jakarta.interceptor.AroundInvoke;

@Validar
@Interceptor
@Priority (Interceptor.Priority.APPLICATION + (0))
public class ValidarInterceptor {

     @AroundInvoke 
    public Object Validar(InvocationContext context) throws Exception {
        System.out.println("La venta empezo a validarse a las : " + java.time.LocalDateTime.now());
        Object result = context.proceed();
        System.out.println("La venta termino de validarse a las : " + java.time.LocalDateTime.now());
        
        return result;
    }

}
