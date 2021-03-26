package edu.dmytroqa.java.package1;

import edu.dmytroqa.java.package2.B;

class A {

    public A() {
        B b = new B();
        System.out.println(b.member1);
        System.out.println(b.member2);
        System.out.println(b.member3);

    }
}
