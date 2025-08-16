package chixing.dayNull;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleProxy implements InvocationHandler {
    protected Object target;

    public SimpleProxy(Object target) {
        this.target = target;
    }

    public Object CreateProxy() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("正在启动："+method.getName());
        Object returnvalue=method.invoke(target, args);
        if(isPrintLog())
            addLog();
        return returnvalue;
    }

    protected boolean isPrintLog(){
        return false;
    }

    protected void addLog(){

    }

}
