package edu.dmytroqa.java.package1;

import edu.dmytroqa.java.package2.B;

public class A {

    public int member1;
    int member2;

    public A() {
        B b = new B();
        b.publicMethod();
        System.out.println(b.member1);
        System.out.println(b.member2);
    }
}
