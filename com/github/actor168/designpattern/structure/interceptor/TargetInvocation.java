package com.github.actor168.designpattern.structure.interceptor;

import java.util.ArrayList;
import java.util.Iterator;

public class TargetInvocation {
    private ArrayList<Interceptor> interceptorList = new ArrayList<>(); 
    private Target target;
    private Iterator<Interceptor> iterator = interceptorList.iterator();

    public void invoke() {
        // invoke by order
        if (iterator.hasNext()) {
            Interceptor i = iterator.next();
            i.before(this);
            i.intercept(this);
            i.after(this);
        } else {
            target.execute("request");
        }
    }

    public void setTarget(Target t) {
        target = t;
    }

    public void addInterceptor(Interceptor interceptor) {
        interceptorList.add(interceptor);
        iterator = interceptorList.iterator();
    }
}
