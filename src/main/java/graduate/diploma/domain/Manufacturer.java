package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "manufacturer")
public class Manufacturer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "manufacturers")
    List<Category> categories = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "manufacturer")
    List<Goods> goods = new ArrayList<>();

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "manufacturer")
    List<Model> models = new ArrayList<>();

    public Manufacturer(String name) {
        this.name = name;
    }
}
