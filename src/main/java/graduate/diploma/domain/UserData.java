package graduate.diploma.domain;

import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
@Entity
@Table(name = "UsersData")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    String surname;
    String email;
    String birthYear;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "userData")
    User user;
}
