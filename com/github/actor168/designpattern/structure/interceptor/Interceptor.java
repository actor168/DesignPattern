package com.github.actor168.designpattern.structure.interceptor;

public interface Interceptor {
    public void before(TargetInvocation target);
    public void intercept(TargetInvocation target);
    public void after(TargetInvocation target);
}