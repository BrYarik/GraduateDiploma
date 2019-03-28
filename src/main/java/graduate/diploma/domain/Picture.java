package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.sql.Blob;

@Entity
@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "Pictures")
public class Picture {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    Blob frontPicture;

    Blob[] goodsPictures;

    @OneToOne(fetch = FetchType.LAZY)
    Goods goods;

    public Picture(Goods goods) {
        this.goods = goods;
    }
}
