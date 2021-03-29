public class NewMain {

    public static void main(String[] args) {
        Child child = new Child();
        RealClass realClass = new RealClass(child);
        realClass.implementMe();
    }
}
