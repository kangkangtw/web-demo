package com.hkk.webdemo.cglib;

import net.sf.cglib.core.DebuggingClassWriter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;

public class PersonService {
    public String sayHello(String name) {
        return "Hello " + name;
    }

    public Integer lengthOfName(String name) {
        return name.length();
    }

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(PersonService.class);
        System.setProperty(DebuggingClassWriter.DEBUG_LOCATION_PROPERTY, "/Users/kang/Desktop/");
        enhancer.setCallback((MethodInterceptor) (o, method, objects, methodProxy) -> {
            System.out.println(method.getDeclaringClass());
            if (method.getDeclaringClass() != Object.class && method.getReturnType() == String.class) {
                return "Hello Tom!";
            } else {
                return methodProxy.invokeSuper(o, objects);
            }
        });
        PersonService proxy = (PersonService) enhancer.create();
        System.out.println(proxy.getClass().getName());
        System.out.println(proxy.sayHello(null));
        System.out.println(proxy.lengthOfName("name"));

    }

}
