package stepDefinitions.api;

import hooks.api.HooksAPI;
import io.cucumber.java.en.Given;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import utilities.ConfigReader;

import static io.restassured.RestAssured.given;

public class APIUS_07_11Stepdefinations {

    /*  https://trendlifebuy.com/api/faqAdd url’ine asagidaki body ile bir POST request gonderdigimizde

         {
             "title": "AbdurrahmanAlas",
             "description":"Abdurrahman"
         }

   DONEN RESPONSEUN

        "responseCode":201;

     {
         "id": 113,
             "title": "AbdurrahmanAlas",
             "description": "Abdurrahman",
             "message": "Faqs added successfully"
     }

          message:"Faqs added successfully" OLDUGUNU DENETLE
     */
    public static String fullPath;
    Response response;

    //  spec.pathParams("pp1","api","pp2","login");
    //  Response response = given().when().get("{pp1}/{pp2}");

    @Given("{string} sets path parameters")
    public void sets_path_parameters(String rawPaths) {
        //  spec.pathParams("pp1","api","pp2","login");
        //  Response response = given().when().get("{pp1}/{pp2}");

        String [] paths = rawPaths.split(",");
        StringBuilder tempPath = new StringBuilder("{");

        for (int i = 0; i < paths.length; i++) {
            String key = "pp" + i;
            String value = paths[i].trim();
            HooksAPI.spec.pathParam(key,value);

            tempPath.append(key + "}/{");


        }

        tempPath.deleteCharAt(tempPath.lastIndexOf("{"));
        tempPath.deleteCharAt(tempPath.lastIndexOf("/"));

        System.out.println("tempPath = " + tempPath);

        fullPath = tempPath.toString();
    }

    @Given("Enters email and password.")
    public void enters_email_and_password() {

        String email = ConfigReader.getProperty("email");
        String password = ConfigReader.getProperty("password");

        /*
        {
             "email": "admin@gmail.com",
              "password": "123123123"
        }
         */

        JSONObject reqBody = new JSONObject();

        reqBody.put("email",email);
        reqBody.put("password",password);

        response = given()
                .contentType(ContentType.JSON)
                .spec(HooksAPI.spec)
                .when()
                .body(reqBody.toString())
                .post(fullPath);

        response.prettyPrint();



    }





    @Given("Request method POST")
    public void request_method_post() {











    }

    @Given("Response Code {int}")
    public void response_code(Integer int1) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Given("Response Message {string}")
    public void response_message(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}

