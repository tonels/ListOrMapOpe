package model;

import lombok.Data;
import lombok.experimental.Accessors;

import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Item {
    private LocalDateTime start;
    private LocalDateTime end;
    private Long total;
}
