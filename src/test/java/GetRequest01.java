import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class GetRequest01 {

    @Test
    public void get01(){

        String url ="https://reqres.in/api/users/02";
        Response response = given().when().get(url);
        response.prettyPrint();

    }
}
