package post_request;

import org.junit.Test;
import pojos.DummyApiDataPojo;

public class Post06  {

    /*
    URL: https://dummy.restapiexample.com/api/v1/create
   HTTP Request Method: POST Request
   Request body: {
                    "employee_name": "Tom Hanks",
                    "employee_salary": 111111,
                    "employee_age": 23,
                    "profile_image": "Perfect image"
                 }
   Test Case: Type by using Gherkin Language
   Assert:
            i) Status code is 200
            ii) Response body should be like the following
                {
                    "status": "success",
                    "data": {
                        "employee_name": "Ali Can",
                        "employee_salary": 111111,
                        "employee_age": 23,
                        "profile_image": "Perfect image",
                        "id": 6344
                    },
                    "message": "Successfully! Record has been added."
                }
 */
    @Test
    public void post01(){
        spec.pathParam
    }
}
