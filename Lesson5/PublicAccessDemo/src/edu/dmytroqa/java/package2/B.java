package edu.dmytroqa.java.package2;

import edu.dmytroqa.java.package1.A;

public class B {

    public int member1;
    int member2;

    public B() {
        A a = new A();
    }

    public void publicMethod() {
        System.out.println("Inside publicMethod()");
    }
}
