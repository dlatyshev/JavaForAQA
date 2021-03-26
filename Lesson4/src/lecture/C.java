package lecture;

public class C {

    private B b; // Has - A // Aggregation / Composition

    public C(B b) {
        this.b = b;
    }


    public static void main(String[] args) {
        B b = new B();
        C c = new C(b);
    }
}
