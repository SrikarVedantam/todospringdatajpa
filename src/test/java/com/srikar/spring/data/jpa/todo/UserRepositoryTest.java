package com.srikar.spring.data.jpa.todo;

import com.srikar.spring.data.jpa.todo.domain.User;
import com.srikar.spring.data.jpa.todo.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by vedantas on 4/7/2018.
 */
@DataJpaTest
@RunWith(SpringRunner.class)
public class UserRepositoryTest {
    @Autowired
    UserRepository userRepository;

    @Autowired
    TestEntityManager entityManager;

    @Test
    public void testing_sort_stuff(){
        Sort sort = new Sort(Sort.Direction.ASC, "name")
                .and(new Sort(Sort.Direction.DESC, "userid"));
        Iterable<User> users = userRepository.findAll(sort);
        for(User user: users){
            System.out.println(user);
        }

    }

    @Test
    public void using_pageable_stuff(){
        PageRequest pageable = new PageRequest(0, 2);
        Page<User> userPage = userRepository.findAll(pageable);
        System.out.println(userPage);
        System.out.println("------------------");
        System.out.println(userPage.getContent());
    }

}
