package Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 代理类，代理了Comparable对象，该类包装了实际的代理对象
 * create by zhangquankang on 2020/5/30
 */
public class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object object){
        target = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.print(target);
        System.out.print("." + method.getName() + "(");
        if(args != null){
            for (int i = 0; i < args.length; i++){
                System.out.print(args[i]);
                if(i < args.length - 1) {
                    System.out.print(", ");
                }
            }
        }
        System.out.println(")");
        return method.invoke(target,args);
    }
}
