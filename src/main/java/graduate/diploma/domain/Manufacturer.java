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

    @ManyToMany(fetch = FetchType.LAZY)
    List<Category> categories = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    List<Goods> goods = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    List<Model> models = new ArrayList<>();

    public Manufacturer(String name) {
        this.name = name;
    }
}
