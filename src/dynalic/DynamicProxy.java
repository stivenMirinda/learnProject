package dynalic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class DynamicProxy implements InvocationHandler {
    private Object obj;
    public DynamicProxy(Object obj){
        this.obj = obj;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object target = method.invoke(obj,args);
        System.out.println(method);
        if (method.equals("createStudent")){
            System.out.println("开始");
            target = method.invoke(obj,args);
            System.out.println("结束");
        }

        return target;
    }
}
