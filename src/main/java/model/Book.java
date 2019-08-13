package model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Book {

    private Integer bookId;

    private String bookName;

    private String author;

    private String location;

    private double price;

    private  BigDecimal deci;

    private LocalDateTime birth;


}
