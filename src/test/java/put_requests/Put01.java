package put_requests;

import base_urls.JsonPlaceHolderBaseUrl;
import org.junit.Test;

public class Put01 extends JsonPlaceHolderBaseUrl {

    /*
    Given
	        https://jsonplaceholder.typicode.com/todos/198
	        {
                "userId": 21,
                "title": "Wash the dishes",
                "completed": false
            }
        When
	 		I send PUT Request to the Url
	    Then
	   	   Status code is 200
	   	   And response body is like   {
									    "userId": 21,
									    "title": "Wash the dishes",
									    "completed": false
									   }
     */
    @Test
    public void Put01(){
        //1.step: set the url
        spec.pathParam("first","todos","second", 198);
    }
}
