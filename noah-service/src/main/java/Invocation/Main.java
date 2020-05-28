package Invocation;

import java.lang.reflect.Proxy;

/**
 * create by zhangquankang on 2020/5/28
 */
public class Main {
    /*public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        IHello iHello = (IHello) Proxy.newProxyInstance(IHello.class.getClassLoader(),
                new Class[]{IHello.class},
                new MyInvocationHandler(new Hello())
                );
        iHello.syHello();
    }*/


}
