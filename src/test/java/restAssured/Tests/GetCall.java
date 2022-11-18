package restAssured.Tests;

import restAssured.Main.RestMain;
import restAssured.Verifications.GetVerifications;
import com.thoughtworks.gauge.Step;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

public class GetCall {
    RestMain main = new RestMain();
    GetVerifications verification = new GetVerifications();

    @Test
    public void getExampleTest() {
        main.getAndLogBody();
    }

    @Test
    public void getExampleTest2() {
        Response response = main.getResponse();
        Object responseObject = response.jsonPath().get("data");
        String responseString = response.jsonPath().get("data").toString();
    }

    @Step("Compare GET Call Data with database")
    public void getDataComparison() {
        Response response = main.getResponse();
        verification.verifyGetData(response.jsonPath().get("data").toString());
    }
}
