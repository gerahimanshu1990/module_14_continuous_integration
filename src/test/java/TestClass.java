import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestClass {

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("In Before Method :: ");
    }

    @Test
    public void test() {
        System.out.println("In Test Method :: ");
    }

}
