package Invocation;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * create by zhangquankang on 2020/5/28
 */
public class MyInvocationHandler implements InvocationHandler {

    private Object target;

    public MyInvocationHandler(Object target){
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object invoke = method.invoke(target,args);
        return invoke;
    }
}
