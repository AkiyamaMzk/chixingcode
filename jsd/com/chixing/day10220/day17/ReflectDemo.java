package chixing.day10220.day17;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

import chixing.dayNull.SimpleStudent;

/**
 * 类全名:包名.类名
 */

public class ReflectDemo {
    public static void main(String[] args) {
        Class<SimpleStudent> clazz = SimpleStudent.class;
        // System.out.println("nam=" + clazz.getName());
        // Class<? super SimpleStudent> superclazz = clazz.getSuperclass();
        // System.out.println("spu=" + superclazz);
        // Class<?>[] interfaces = clazz.getInterfaces();
        // for (Class<?> class1 : interfaces) {
        // System.out.println(class1);
        // }
        // Method[] methods = clazz.getMethods();
        // SimpleStudent simpleStudent = null;
        // try {
        // simpleStudent =
        // clazz.getDeclaredConstructor(String.class,String.class).newInstance("1","1");
        // } catch (InstantiationException | IllegalAccessException |
        // IllegalArgumentException | InvocationTargetException
        // | NoSuchMethodException | SecurityException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // for (Method method : methods) {
        // if (method.getName().equals("getStudnetId")) {
        // try {
        // Object invoke = method.invoke(simpleStudent);
        // System.out.println(invoke);
        // } catch (IllegalAccessException | InvocationTargetException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }
        // }
        // }
        SimpleStudent simpleStudent=null;
        try {
            simpleStudent = 
            clazz.getDeclaredConstructor(String.class, String.class).newInstance("1", "1");
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException | InvocationTargetException
                | NoSuchMethodException | SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        Field[] declaredFields = clazz.getDeclaredFields();
        for (Field field : declaredFields) {
            try {
                field.set(simpleStudent, "123");//id:private
            } catch (IllegalArgumentException | IllegalAccessException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println(field.getName() + "  type:" + field.getType() + "  " + field.getModifiers());
        }

    }

}
