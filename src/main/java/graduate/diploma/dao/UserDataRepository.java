package graduate.diploma.dao;

import graduate.diploma.domain.WebUser;
import graduate.diploma.domain.UserData;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDataRepository extends JpaRepository<UserData, Long> {
    UserData findByWebUser(WebUser webUser);
}
