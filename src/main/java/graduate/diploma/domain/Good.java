package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
@Entity
@Table(name = "Goods")
public class Good {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    String model;
    String manufacturer;
    String year;
    double price;

    @OneToOne(fetch = FetchType.LAZY)
    Picture pictures;

    @OneToMany(fetch = FetchType.LAZY)
    Category category;
}
