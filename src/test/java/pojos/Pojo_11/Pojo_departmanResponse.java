package pojos.Pojo_11;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pojo_departmanResponse {

/*

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




 */

    private int id;
    private String name;
    private String details;
    private int status;
    private String created_at;
    private String updated_at;

}