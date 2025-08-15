package chixing.day10220.day20.proxy.cgclib;

import java.lang.reflect.Method;

import chixing.day10220.day20.proxy.jdk.LogUtil;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class CGLibProxy implements MethodInterceptor {
    private Object target;

    public CGLibProxy(Object target) {
        this.target = target;
    }

    public Object newProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        object = this.target;
        Object returnValue = method.invoke(object, args);
        if (method.getName().startsWith("add") || method.getName().startsWith("update")
                || method.getName().startsWith("delete")) {
            new LogUtil().addLog();
        }
        return returnValue;
    }
}
