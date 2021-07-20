package com.github.actor168.designpattern.structure.interceptor;

class Request implements Target {

    @Override
    public void execute(String request) {
        System.out.println("target request executed ... " + request);        
    }
    
}