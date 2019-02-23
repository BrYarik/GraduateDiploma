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
@Table(name = "model")
public class Model {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "models", cascade = CascadeType.ALL)
    @JoinColumn(name = "manufacturer_id")
    Manufacturer manufacturer;

    @ManyToOne(fetch = FetchType.LAZY)
    List<Goods> goods = new ArrayList<>();

    public Model(String name) {
        this.name = name;
    }
}
