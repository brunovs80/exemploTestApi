package org.example.testapi;

import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;

public class ApiTests {

    @BeforeClass
    public static void setup() {
        baseURI = "https://reqres.in";
        basePath = "/api";
    }

    @Test
    public void addUserSuccess() {
        ValidatableResponse validatableResponse = given().log().all().
                body("{\"name\": \"Bruno\", \"job\": \"QA\"}").
                when().
                post("/users").
                then().
                statusCode(201);

    }


}
