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
@Table(name = "usersData")
public class UserData {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String name;
    String surname;
    String email;
    String birthYear;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "userData", cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id")
    WebUser webUser;

    public UserData(String name, String surname, String email, String birthYear) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthYear = birthYear;
    }
}
