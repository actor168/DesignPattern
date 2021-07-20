package com.github.actor168.designpattern.structure.interceptor;

public class Main {
    /**
     * 拦截器模式（interceptors）
     * 
     * 概念定义：
     * 
     * 适用场景：
     * 主要构成：调度器（invocation）、拦截器（interceptor）、业务逻辑
     * 
     * 调度器：负责多个拦截器的管理和调度
     */
    public static void main(String[] args) {
        TargetInvocation invocation = new TargetInvocation();
        invocation.addInterceptor(new AuthorizationInterceptor());
        invocation.addInterceptor(new LogInterceptor());
        invocation.setTarget(new Request());
        invocation.invoke();
    }
}
