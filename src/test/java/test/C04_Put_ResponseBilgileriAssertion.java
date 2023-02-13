package test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class C04_Put_ResponseBilgileriAssertion {


    @Test
    public void pu01() {

        //1- Request icin gerekli olan URL ve Body hazirla

        String url = "https://jsonplaceholder.typicode.com/posts/70";

        JSONObject reqBody = new JSONObject();
        reqBody.put("title", "Ahmet");
        reqBody.put("body", "Merhaba");
        reqBody.put("userId", 10);
        reqBody.put("id", 70);

        System.out.println(reqBody);


        //2-Soruda istendiyse Expected Data hazirla

        //3- Response i kaydet
        Response response = (Response) given().
                contentType(ContentType.JSON).
                when().
                body(reqBody.toString()).
                put(url);

        response.prettyPrint();

        //4- Assertion

        response.then().assertThat().
                statusCode(200).
                contentType("application/json; charset=utf-8").
                header("Server", "cloudflare").
                statusLine("HTTP/1.1 200 OK");


    }


}
