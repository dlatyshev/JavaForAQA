package testframework;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class TestRunner {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Class<TestClass> tests = TestClass.class;
        Method[] methods = tests.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(Test.class) && !method.isAnnotationPresent(Ignore.class)) {
                method.invoke(new TestClass());
            }
        }
    }
}
