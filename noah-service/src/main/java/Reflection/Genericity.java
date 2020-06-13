package Reflection;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * create by zhangquankang on 2020/6/3
 */
public class Genericity {

    public static void main(String[] args) throws Exception{
        ArrayList<String> list = new ArrayList();
        list.add("this");
        list.add("is");

        Class listClass = list.getClass();
        Method method = listClass.getMethod("add",Object.class);
        method.invoke(list,5);
        for (Object obj:list) {
            System.out.println(obj);
        }
        System.out.println(list.size());
    }


}
