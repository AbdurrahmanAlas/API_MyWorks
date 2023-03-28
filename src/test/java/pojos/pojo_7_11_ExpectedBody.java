package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class pojo_7_11_ExpectedBody {


    /*
      {
         "id": 113,
             "title": "AbdurrahmanAlas",
             "description": "Abdurrahman",
             "message": "Faqs added successfully"
     }

     */

    private int StatusCode;
    private String message;
    private pojo_7_11 data;





}
