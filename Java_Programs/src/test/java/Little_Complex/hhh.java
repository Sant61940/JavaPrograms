package Little_Complex;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class hhh {

    @DataProvider(name = "TestData")
    public Object[][] testData() {
        // Define your test data here
        return new Object[][] {
            { "User1", "Password1" },
            { "User2", "Password2" },
            { "User3", "Password3" }
        };
    }

    @Test(dataProvider = "TestData")
    public void loginTest(String username, String password) {
        // Your test logic here using username and password
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}