package com.github.actor168.designpattern.structure.interceptor;

public class AuthorizationInterceptor implements Interceptor{

    @Override
    public void intercept(TargetInvocation target) {
        System.out.println("authorize....");
        target.invoke();
    }

    @Override
    public void before(TargetInvocation target) {
        System.out.println("before authz....");

    }

    @Override
    public void after(TargetInvocation target) {
        System.out.println("after authz....");
    }
    
}
