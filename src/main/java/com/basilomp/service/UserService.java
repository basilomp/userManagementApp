package com.basilomp.service;

import com.basilomp.entity.User;
import com.basilomp.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


@Service
@RequiredArgsConstructor
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Transactional
    public void saveUser(User user) {
        userRepository.save(user);
    }

//    @Transactional
//    public List<User> findAll() {
//        return new ArrayList<>().add(userRepository.findAll());
//    }
}
