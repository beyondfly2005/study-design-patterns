package v2;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * java 反射机制实例化对象  调用的代参数的构造函数
 */

public class TestClassForName {
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException,
            NoSuchMethodException, SecurityException, IllegalArgumentException,
            InvocationTargetException {

        Class stu = Class.forName("v2.Student");
        Constructor constructor = stu.getConstructor(int.class, String.class);
        Student student = (Student) constructor.newInstance(23, "lily");
        System.out.println("the student name: " + student.getName() + "\n"
                + "the age is : " + student.getAge());

    }
}
