import org.testng.annotations.DataProvider;

public class DP {
    @DataProvider(name="LoginCredentials")
    public Object[][] data(){

        return new Object[][]{{"test@test.com","Password@123"},{"test1@test.com","Password@123"}};
    }
}
