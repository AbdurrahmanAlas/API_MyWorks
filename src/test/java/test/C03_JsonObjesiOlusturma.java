package test;

import org.json.JSONObject;
import org.junit.Test;

public class C03_JsonObjesiOlusturma {

    /*
    Asagıdaki JSON objesini olusturup konsolda yazdirin

    {

    "title" :"Ahmet",
    "body" :"Merhaba",
    "userId":1

     */

    @Test
    public void jsonObje01(){


        JSONObject ilkJsonObje=new JSONObject();
        ilkJsonObje.put("title","Ahmet");
        ilkJsonObje.put("body","Merhaba");
        ilkJsonObje.put("userId",1);


        System.out.println(ilkJsonObje);
    }

    @Test
    public void jsonOnje02 (){

        /*

        {
    "firstname": "John",
    "lastname": "Smith",
    "totalprice": 111,
    "depositpaid": true,
    "bookingdates": {
        "checkin": "2018-01-01",
        "checkout": "2019-01-01"
    },
    "additionalneeds": "Breakfast"
}






         */

JSONObject innerjsonObje=new JSONObject();
innerjsonObje.put("checkin", "2018-01-01");
innerjsonObje.put("checkout", "2019-01-01");

JSONObject body=new JSONObject();
body.put("firstname","John");
body.put("additionalneeds", "Breakfast");
body.put("bookingdates",innerjsonObje);
body.put("totalprice",111);
body.put("depositpaid",true);
body.put("lastname","Brown");
        System.out.println(body);


    }

}
