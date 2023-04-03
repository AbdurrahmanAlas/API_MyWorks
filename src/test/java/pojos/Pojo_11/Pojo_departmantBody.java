package pojos.Pojo_11;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pojo_departmantBody {

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
}
     */

    private Pojo_DepartmanDetails_ic departmentDetails;
    private String message;

}