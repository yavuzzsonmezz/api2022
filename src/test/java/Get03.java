import io.restassured.response.Response;
import org.junit.Test;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;

public class Get03 extends BaseUrls{

    /*
        Given
            https://jsonplaceholder.typicode.com/todos/23
        When
            User send GET Request to the URL
        Then
            HTTP Status Code should be 200
      And
          Response format should be "application/json"
      And
          "title" is "et itaque necessitatibus maxime molestiae qui quas velit",
      And
          "completed" is false
      And
          "userId" is 2
     */
    @Test
    public void get01(){

        //1.Step: Set the Url
        //String url = "https://jsonplaceholder.typicode.com/todos/23";//This is not recommended
        spec.pathParams("first", "todos", "second", 23);

        //2.Set the Expected Data

        //3.Step: Send the Request and Get the Response
        Response response = given().spec(spec).when().get("/{first}/{second}");

        //4.Step: Do Assertions
        response.
                then().
                assertThat().
                statusCode(200).
                contentType("application/json").
                body("title", equalTo("et itaque necessitatibus maxime molestiae qui quas velit")).
                body("completed", equalTo(false)).
                body("userId", equalTo(2));
    }

}