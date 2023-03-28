package test;

import io.restassured.response.Response;
import org.json.JSONObject;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class US007_TC0703Get {
    /*
    /api/faqsDetails endpoint'ine gecerli authorization bilgileri
     ve detaylarina erisilmek istenilen faq's id'sini iceren bir
      GET request body gönderildiginde dönen
      status code'in 200 ve
    response body'deki message bilgisinin "success" oldugu dogrulanmali.

     */

    @Test
    public void test_api_faqsDetails(){

        //1- Gonderecegimiz Request icin gerekli URL ve ihtiyac varsa Body hazirla

        String url="https://trendlifebuy.com/api/faqsDetails";

        //2- Eger Soruda bize verilmisse Expected Data hazirla
        JSONObject expectedBody=new JSONObject();
        expectedBody.put("id",22);
        expectedBody.put("title","dolor sint quo a velit explicabo quia nam");
        expectedBody.put("body","eos qui et ipsum ipsam suscipit aut\nsed omnis non odio\nexpedita ear" +
                "um mollitia molestiae aut atque rem suscipit\nnam impedit esse");

        System.out.println(expectedBody);


        //3- Bize donen Response i Actual Data olarak kaydet

        Response response= given().when().get(url);
         response.prettyPrint();
        System.out.println("Status code:" +response.getStatusCode());



        //4- Expected data ile Actual dta karsılastırma Assertion








    }







}
