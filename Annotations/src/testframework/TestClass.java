package testframework;

public class TestClass {

    @Test
    public void verifyUserCanLogIn() {
        System.out.println("User can login");
    }

    @Test
    public void verifyUserCanLogOut() {
        System.out.println("User can log out");
    }

    @Test
    @Ignore
    public void thisTestShouldBeIgnored() {
        System.out.println("You won't see this message");
    }

    public void someHelperMethod() {
        ///
    }
}
