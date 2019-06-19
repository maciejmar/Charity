package pl.coderslab.donation;

import pl.coderslab.category.Category;
import pl.coderslab.institution.Institution;


import javax.persistence.*;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "donation")
public class Donation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Integer quantity;

    @ManyToMany
    private List<Category> categories = new ArrayList<Category>();

    @ManyToOne
    private Institution institution;

    private String street;
    private String city;
    private String ZipCode;
    private LocalDate pickUpDate;
    private LocalTime pickUpTime;
    private String pickUpComment;
}
