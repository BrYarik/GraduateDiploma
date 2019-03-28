package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "goods")
public class Goods {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    int year;
    double price;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "model_id")
    Model model;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    Manufacturer manufacturer;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "goods", cascade = CascadeType.ALL)
    @JoinColumn(name = "picture_id")
    Picture pictures;

    public Goods(String name, int year, double price) {
        this.name = name;
        this.year = year;
        this.price = price;
    }
}
