package com.github.actor168.designpattern.structure.interceptor;

public class LogInterceptor implements Interceptor{

    @Override
    public void intercept(TargetInvocation target) {
        System.out.println("logger....");
        target.invoke();
    }

    @Override
    public void before(TargetInvocation target) {
        System.out.println("before logging...");

    }

    @Override
    public void after(TargetInvocation target) {
        System.out.println("after logging....");
    }
    
}
