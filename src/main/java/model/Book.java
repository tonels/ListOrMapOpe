package model;


import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Data
@Accessors(chain = true)
public class Book implements Serializable {

    private Integer bookId;

    private String bookName;

    private String author;

    private String location;

    private double price;

    private  BigDecimal deci;

    private LocalDateTime birth;

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                ", deci=" + deci +
                ", birth=" + birth +
                '}';
    }
}
