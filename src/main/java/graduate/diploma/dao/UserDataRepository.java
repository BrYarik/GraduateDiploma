package graduate.diploma.dao;

import graduate.diploma.domain.User;
import graduate.diploma.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
    UserData findByEmail(String email);

    UserData findByUser(User user);
}
