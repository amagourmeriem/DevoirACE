package ma.xproce.devoir.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class BookDTO {
    private String titre;
    private String publisher;
    private LocalDate datePublication;
    private double price;
    private String resume;
}

