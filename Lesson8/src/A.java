public class A extends Main implements Cloneable {
    public int a = 5;
    public int b = 10;

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException ex) {
            // System.out.println("Cloning not allowed");
            return null;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (this == o) return true;
        if (getClass() != o.getClass())return false;
        A myA = (A) o;

        return this.a == myA.a && this.b == myA.b;
    }

    @Override
    public void add(Object el) {
        //
    }

    public static void main(String[] args) {
        A a = new A();
        a.add(new Object());
    }
}
