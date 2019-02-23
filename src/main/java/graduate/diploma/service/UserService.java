package graduate.diploma.service;

import graduate.diploma.dao.UserDataRepository;
import graduate.diploma.dao.UserRepository;
import graduate.diploma.domain.User;
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
    public void addUser(User user) {
        userRepository.save(user);
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
    public User findByLogin(String login) {
        return userRepository.findByLogin(login);
    }

    @Transactional(readOnly = true)
    public UserData findDataByUser(User user) {
        return userDataRepository.findByUser(user);
    }

    @Transactional(readOnly = true)
    public UserData findDataByLogin(String login) {
        return userDataRepository.findByUser(userRepository.findByLogin(login));
    }

    @Transactional(readOnly = true)
    public UserData findByEmail(String email) {
        return userDataRepository.findByEmail(email);
    }

    @Transactional(readOnly = true)
    public String findLoginByEmail(String email) {
        return userDataRepository.findByEmail(email).getUser().getLogin();
    }

    @Transactional(readOnly = true)
    public String findPasswordByLogin(String login) {
        return findByLogin(login).getPassword();
    }



}
