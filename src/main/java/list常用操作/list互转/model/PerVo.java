package list常用操作.list互转.model;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class PerVo {

    private Long perId;

    private String name;

    private LocalDateTime birth;

    private String desc;


}
