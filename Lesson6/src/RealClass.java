public class RealClass {

    AbstractClass abstractClass;

    public RealClass(AbstractClass abstractClass) {
        this.abstractClass = abstractClass;
    }

    void implementMe() {
        abstractClass.implementMe();
    }

    public void print(String s) {

    }
}
