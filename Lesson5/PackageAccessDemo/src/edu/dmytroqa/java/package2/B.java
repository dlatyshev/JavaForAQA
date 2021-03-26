package edu.dmytroqa.java.package2;

import edu.dmytroqa.java.package1.A;

public class B {

    public int member1;
    int member2;
    private int member3;


    public B() {
        A a = new A();
        C c = new C(); // There in no need to import C
        System.out.println(c.member1);
        System.out.println(c.member2);
        System.out.println(c.member3);
    }
}
