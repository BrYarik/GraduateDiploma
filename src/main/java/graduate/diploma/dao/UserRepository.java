package graduate.diploma.dao;

import graduate.diploma.domain.WebUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<WebUser, Long> {
    WebUser findByLogin(String login);

    WebUser findByEmail(String email);
}
