package graduate.diploma.service;

import graduate.diploma.dao.UserDataRepository;
import graduate.diploma.dao.UserRepository;
import graduate.diploma.domain.WebUser;
import graduate.diploma.domain.UserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserDataRepository userDataRepository;

    @Transactional
    public void addUser(WebUser webUser) {
        userRepository.save(webUser);
    }

    @Transactional
    public void deleteUser(long id) {
        userRepository.deleteById(id);
    }

    @Transactional
    public void addUserData(UserData userData) {
        userDataRepository.save(userData);
    }

    @Transactional(readOnly = true)
    public WebUser findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Transactional(readOnly = true)
    public UserData findDataByUser(WebUser webUser) {
        return userDataRepository.findByWebUser(webUser);
    }

    @Transactional(readOnly = true)
    public UserData findDataByLogin(String login) {
        return userDataRepository.findByWebUser(userRepository.findByLogin(login));
    }

    @Transactional(readOnly = true)
    public UserData findByEmail(String email) {
        return userRepository.findByEmail(email).getUserData();
    }

    @Transactional(readOnly = true)
    public String findLoginByEmail(String email) {
        return userRepository.findByEmail(email).getLogin();
    }

    @Transactional(readOnly = true)
    public String findPasswordByLogin(String login) {
        return findByLogin(login).getPassword();
    }



}
