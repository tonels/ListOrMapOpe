package 自定义注解.anno4;

import lombok.Data;

import java.util.Date;

@Data
public class User {

    @DBField(name = "id",isPrimaryKey = true,type = Long.class)
    private Long id;

    @DBField(name = "name",type = String.class)
    private String name;

    @DBField(name = "email",type = String.class)
    private String email;

    @DBField(name = "created",type = Date.class)
    private Date created;

}
