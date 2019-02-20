package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.io.File;

@Entity
@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Table(name = "Pictures")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    File []goodsPictures;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "pictures")
    Good goods;
}
