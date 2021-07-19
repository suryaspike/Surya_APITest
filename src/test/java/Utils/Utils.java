package Utils;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.junit.jupiter.api.Assertions;

import static io.restassured.RestAssured.given;

public class Utils {

       @Given("Validate list all customers functionality")
        public void getRequest() {
           RestAssured.baseURI = "http://localhost:4547/Blog.Api";
           RequestSpecification httpRequest = RestAssured.given();

           Response response = httpRequest.request(Method.GET, "/Customers");
           ResponseBody body = response.getBody();


           JsonPath jsonPathEvaluator = response.jsonPath();

           Assertions.assertNotNull(jsonPathEvaluator.get("data"));

           Assertions.assertNotNull(jsonPathEvaluator.get("data.id"));
           Assertions.assertNotNull(jsonPathEvaluator.get("data.email"));
           Assertions.assertNotNull(jsonPathEvaluator.get("data.first_name"));
           Assertions.assertNotNull(jsonPathEvaluator.get("data.last_name"));

           String responseBody = body.asString();
           System.out.println("Response Body is =>  " + responseBody);
       }

        @And("Validate response for customer (.*) has id (.*), email (.*), first name (.*) and last name (.*)$")
        public void validateCustomerResponse(String customer,String id, String email, String fname, String lname){
            RestAssured.baseURI = "http://localhost:4547/Blog.Api";
            RequestSpecification httpRequest = RestAssured.given();

            Response response = httpRequest.request(Method.GET, "/"+customer+"/CustomerView");
            JsonPath jsonPathEvaluator = response.jsonPath();

            Assertions.assertEquals("success",jsonPathEvaluator.get("status").toString());

            Assertions.assertEquals(id,jsonPathEvaluator.get("data.customerID").toString());
            Assertions.assertEquals(email,jsonPathEvaluator.get("data.email").toString());
            Assertions.assertEquals(fname,jsonPathEvaluator.get("data.first_name").toString());
            Assertions.assertEquals(lname,jsonPathEvaluator.get("data.last_name").toString());
        }

    @And("Validate response for customer (.*) has status (.*), code (.*), and message (.*)$")
    public void validateStatusCodeMessage(String customer, String status, String code, String message){
        RestAssured.baseURI = "http://localhost:4547/Blog.Api";
        RequestSpecification httpRequest = RestAssured.given();

        Response response = httpRequest.request(Method.GET, "/"+customer+"/CustomerView");
        JsonPath jsonPathEvaluator = response.jsonPath();

        Assertions.assertEquals(status,jsonPathEvaluator.get("status").toString());
        Assertions.assertEquals(code,jsonPathEvaluator.get("code").toString());
        Assertions.assertEquals(message,jsonPathEvaluator.get("message").toString());
    }
}

