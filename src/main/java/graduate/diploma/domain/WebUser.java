package graduate.diploma.domain;

import graduate.diploma.security.UserRoles;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "users")
public class WebUser {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    long id;

    String login;
    String password;

    @Enumerated(EnumType.STRING)
    UserRoles role;

    @OneToOne(fetch = FetchType.LAZY)
    UserData userData;

    public WebUser(String login, String password, UserRoles role) {
        this.login = login;
        this.password = password;
        this.role = role;
    }

    public WebUser(String login, String password) {
        this.login = login;
        this.password = password;
    }
}
