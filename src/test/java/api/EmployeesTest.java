package api;
import io.restassured.RestAssured;
import io.restassured.http.Header;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.json.simple.JSONArray;
import org.junit.Assert;
import org.junit.Test;



public class EmployeesTest {

    @Test
    public void EmployeesAPITest(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/employees";
        RequestSpecification httpRequest=RestAssured.given();
        Response response = httpRequest.request(Method.GET);
        Assert.assertEquals(response.getStatusCode(),200);
    }

    @Test
    public void EmployeesAPIRestAssuredTest(){
        RestAssured.get("http://dummy.restapiexample.com/api/v1/employees").
                then().assertThat().statusCode(200);
    }

    @Test
    public void EmployeesAPICreateUser(){
        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification createRequest=RestAssured.given();
        createRequest.header(new Header("contentType","application/json"));
        createRequest.body("{\"name\":\"name\",\"salary\":\"100\",\"age\":\"18\"}");
        Response createResponse = createRequest.request(Method.POST, "/create");
        System.out.println(createResponse.body().print());

        String employeeId = new JsonPath(createResponse.body().asString()).get("data.id").toString();
        System.out.println(employeeId);

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1/";
        RequestSpecification getRequest=RestAssured.given();
        Response getResponse = getRequest.request(Method.GET, "employee/"+employeeId);
        System.out.println(getResponse.body().print());

        RestAssured.baseURI = "http://dummy.restapiexample.com/api/v1";
        RequestSpecification deleteRequest=RestAssured.given();
        Response deleteResponse = deleteRequest.request(Method.DELETE, "/delete/"+ employeeId);
        System.out.println(deleteResponse.body().print());
    }

}
