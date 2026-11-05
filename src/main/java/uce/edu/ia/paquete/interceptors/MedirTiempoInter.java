package uce.edu.ia.paquete.interceptors;

import jakarta.annotation.Priority;
import jakarta.interceptor.AroundInvoke;
import jakarta.interceptor.Interceptor;
import jakarta.interceptor.InvocationContext;

@MedirTiempo 
@Interceptor 
@Priority (Interceptor.Priority.APPLICATION + (1))
public class MedirTiempoInter {

    
    @AroundInvoke 
    public Object medirTiempo(InvocationContext context) throws Exception {
       long init = System.currentTimeMillis();
       Object result =context.proceed();
        long end = System.currentTimeMillis();
       System.out.println("--------Tiempo de ejecucion del metodo " + context.getMethod().getName() + " : " + (end - init) + " milisegundos-----");
        return result;
    }
}
