package RestAssured;

import io.restassured.response.Response;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class getId {
    @Test
    public void getID(){
        Response response=given().when().get("http://localhost:3000/employees");
        System.out.println(response.getStatusCode());
        response.prettyPrint();
    }

    public static void main(String[] args) {
        getId a=new getId();
        a.getID();
    }
}
