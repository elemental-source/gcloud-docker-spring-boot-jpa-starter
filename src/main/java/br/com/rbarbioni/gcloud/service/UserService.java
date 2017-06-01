package br.com.rbarbioni.gcloud.service;

import br.com.rbarbioni.gcloud.model.User;
import br.com.rbarbioni.gcloud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by renan on 01/06/17.
 */

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> findAll (){
        return this.userRepository.findAll();
    }
}
