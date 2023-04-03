package ApiStepdefinitions;

import TestData.TestData;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;
import pojos.trendlifebuy0506.Pojo_11.Pojo_DepartmanDetails_ic;
import pojos.trendlifebuy0506.Pojo_11.Pojo_departmantBody;
import pojos.trendlifebuy0506.Pojo_11.Pojo_departmanRequest;
import pojos.trendlifebuy0506.Pojo_11.Pojo_departmanResponse;
import utilities.ConfigReader;

public class API_011 extends TestData{


    public String fullPath;
    Pojo_DepartmanDetails_ic requestBody;
    Pojo_departmanResponse departmentDetails;

    Pojo_departmantBody expBody;

    Response response;

    @Given("Trendlifebuy APi user sets {string} path parameters_ABD")
    public void trendlifebuyAPiUserSetsPathParameters_ABD(String rawPaths) {

        fullPath = setParameters(rawPaths);
    }
    @Then("departmanDetails get requestBody_ABD")
    public void departman_details_get_request_body_abd() {

        /*
        {
         "id" : 15         }

         */
        requestBody = new Pojo_DepartmanDetails_ic(15);



    }
    @Then("verify relavant fields are visible_abd")
    public void verify_relavant_fields_are_visible_abd() {
        String body = response.prettyPrint();
        SoftAssert softAssert = new SoftAssert();
        for (String each : getAllFieldsOfDepartman()){
            softAssert.assertTrue(body.contains(each),"' "+each+" '"+ "is not visible!");
        }
        softAssert.assertAll();
    }
    @Then("sends a get departmandetails request_ABD")
    public void sends_a_get_departmandetails_request_abd() {
        response=getRequestAdminwithBody(fullPath, requestBody, ConfigReader.getProperty("abdurrahmanToken"));
        System.out.println("response:");
        response.prettyPrint();
    }



    @And("status code {int} message success response body_ABD")
    public void statusCodeMessageSuccessResponseBody_ABD(int int1) {

        response.then().assertThat().statusCode(int1);

        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(jsonPath.get("message"),TestData.faqsDetailsMessage);



    }
    @Then("departmanDetails get requestBody_ABDU")
    public void departmandetailsGetRequestBody_ABDU() {


        //requestDepartmans = new Pojo_departmanRequest(15);
        // System.out.println("requestBody = >>> " + requestDepartmans);

    }
    @Then("sends a get departmandetails request_ABDU")
    public void sendsAGetDepartmandetailsRequest_ABDU() {



        //departmentDetails=new Pojo_departmanResponse(12,"Marketing 2","Marketing Department 2",100,"2023-02-23T10:45:18.000000Z","2023-02-23T10:45:18.000000Z");
        //expBody=new Pojo_departmantBody(departmentDetails,"success");

    }
    @Then("departmanDetails get expectedBody_ABDU")
    public void departmandetailsGetExpectedBody_ABD() {
        /*
         {
   "departmentDetails": [
        {
            "id": 12,
            "name": "Marketing 2",
            "details": "Marketing Department 2",
            "status": 100,
            "created_at": "2023-02-23T10:45:18.000000Z",
            "updated_at": "2023-02-23T10:45:18.000000Z"
        }
    ],
    "message": "success"
}
         */


/*
        TestData testData = new TestData();
        response=testData.getRequestAdminwithBody(fullPath, requestDepartmans, ConfigReader.getProperty("abdurrahmanToken"));
        System.out.println("response:");
        response.prettyPrint();
*/





    }

    @Then("verify  datala_ABD")
    public void verifyDatala_ABD() {


        Pojo_departmantBody respPojo=response.as(Pojo_departmantBody.class);

        Assert.assertEquals(expBody.getDepartmentDetails().getId(),respPojo.getDepartmentDetails().getId());
        Assert.assertEquals(expBody.getDepartmentDetails().getName(),respPojo.getDepartmentDetails().getName());
        Assert.assertEquals(expBody.getDepartmentDetails().getDetails(),respPojo.getDepartmentDetails().getDetails());
        Assert.assertEquals(expBody.getDepartmentDetails().getStatus(),respPojo.getDepartmentDetails().getStatus());
        Assert.assertEquals(expBody.getDepartmentDetails().getCreated_at(),respPojo.getDepartmentDetails().getCreated_at());
        Assert.assertEquals(expBody.getDepartmentDetails().getUpdated_at(),respPojo.getDepartmentDetails().getUpdated_at());


    }




    //*************************************************TC1103********************************************************//

    @Given("prepare the path parameters as {string} _ABD")
    public void prepare_the_path_parameters_as__abd(String paths) {

        fullPath= setParameters(paths);
    }

    @Given("the wrongdepartmentDetails requestBody _ABD")
    public void the_wrongdepartment_details_request_body__abd() {
        requestBody= new Pojo_DepartmanDetails_ic(265);
    }
    @Given("save the departmentDetails response body_ABD")
    public void save_the_department_details_response_body_abd() {

        response=getRequestAdminwithBody(fullPath,requestBody,ConfigReader.getProperty("abdurrahmanToken"));
        response.prettyPrint();
    }
    @Given("verify the returned status code is {int} _ABD")
    public void verify_the_returned_status_code_is__abd(Integer statusCode) {

        response.then().assertThat().statusCode(statusCode);
    }
    @Given("verify the information message is {string} _ABD")
    public void verify_the_information_message_is__abd(String message) {
        JsonPath jsonPath = response.jsonPath();
        Assert.assertEquals(message,jsonPath.get("message"));
    }


    //*******************************************TC01104********************************************************//


    @Given("departmanUpdate requestBody _ABD")
    public void departman_update_request_body__abd() {

        requestBody = new Pojo_DepartmanDetails_ic("Abdurrahman2","Deneme Yapiyoruz2",1);

    }
    @Given("save the  departmanUpdate response body_ABD")
    public void save_the_departman_update_response_body_abd() {

        response=patchRequest(fullPath,requestBody,ConfigReader.getProperty("abdurrahmanToken"));
        response.prettyPrint();

    }

    // @Given("{string} methoduyla body durumu {int} olan bir response kaydet")
    // public void methoduyla_body_durumu_olan_bir_response_kaydet(String method, Integer bodyDurum) {

    //     switch(method){
    //        case "GET":
    //            // get methodunu cagiracak
    //            break;
    //            case "POST";
}






