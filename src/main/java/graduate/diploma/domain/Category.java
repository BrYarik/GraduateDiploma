package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Table(name = "Categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    List<Good> goods = new ArrayList<Good>();
}
