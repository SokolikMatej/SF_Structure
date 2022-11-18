package restAssured.Main;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

/**
 * Page containing menu button and user manipulation buttons
 */
public class RestMain {

    String url = "http://demo.guru99.com/V4/sinkministatement.php";
    String customer_id = "68195";
    String password = "1234!";
    String accountNo = "1";

    public void getAndLogBody() {
        given().queryParam("CUSTOMER_ID",customer_id)
                .queryParam("PASSWORD",password)
                .queryParam("Account_No",accountNo)
        .when()
                .get(url)
       .then()
                .statusCode(200)
                .log().body();
    }

    public Response getResponse() {
        return given()
                .baseUri("https://reqres.in/api/users")
                .when()
                    .log().all()
                    .get()
                .then()
                    .extract().response();
    }
}
