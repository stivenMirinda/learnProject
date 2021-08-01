package dynalic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class DynamicTest {
    public static void main(String[] args) {
        IStudentService studentService = new StudentServiceImpl();
        InvocationHandler invocationHandler = new DynamicProxy(studentService);
        IStudentService proxy = (IStudentService) Proxy.newProxyInstance(studentService.getClass().getClassLoader(),studentService.getClass().getInterfaces(),invocationHandler);
        Student student = proxy.createStudent("李胜涛",22);
        System.out.println(student.toString());
    }
}
