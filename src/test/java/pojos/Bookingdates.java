package pojos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor


public class Bookingdates {

    /*
    "bookingdates":{


                    "checkin": "2022-09-09"
                    "checkout": "2022-09-21"
     */

    private String checkin;
    private String checkout;

}
