package get_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static io.restassured.RestAssured.*;

public class Get07 extends JsonPlaceHolderBaseUrl {



    /*
            Given
                  https://jsonplaceholder.typicode.com/todos
          When
              I send GET Request to the URL
          Then
              1)Status code is 200
              2)Print all ids greater than 190 on the console
                Assert that there are 10 ids greater than 190
              3)Print all userIds less than 5 on the console
                Assert that maximum userId less than 5 is 4
              4)Print all titles whose ids are less than 5
                Assert that "delectus aut autem" is one of the titles whose id is less than 5
         */
    @Test
    public void get01(){


        //1.Step:Set the URL
        spec.pathParam("first", "todos");

        //2.Step:Set the Expected Data

        //3.Step:Send the Request and Get the Response
        Response response = given().spec(spec).when().get("/{first}");
        response.prettyPrint();

        //Do Assertions
        //1)Status code is 200
        response.then().assertThat().statusCode(200);

        //2)Print all ids greater than 190 on the console
        JsonPath json = response.jsonPath();

        List<Integer> ids = json.getList("findAll{it.id>190}.id");//Groovy Language: Java Based Programming Language
        System.out.println(ids);

    }

}