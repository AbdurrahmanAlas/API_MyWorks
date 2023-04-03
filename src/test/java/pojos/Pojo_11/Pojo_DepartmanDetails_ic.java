package pojos.Pojo_11;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Pojo_DepartmanDetails_ic {

/*
 {
            "id": 12,
            "name": "Marketing 2",
            "details": "Marketing Department 2",
            "status": 100,
            "created_at": "2023-02-23T10:45:18.000000Z",
            "updated_at": "2023-02-23T10:45:18.000000Z"
        }
 */

    public Pojo_DepartmanDetails_ic(int id) {

        this.id = id;
    }
    public Pojo_DepartmanDetails_ic(String name,String details,int status)
    {
        this.details=details;
        this.name=name;
        this.status=status;
    }

    private int id;

    private String name;
    private  String details;
    private  int status;
    private String created_at;
    private String updated_at;

}
