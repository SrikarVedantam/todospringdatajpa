package com.srikar.spring.data.jpa.todo.repositories;

import com.srikar.spring.data.jpa.todo.domain.User;
import org.springframework.data.repository.PagingAndSortingRepository;

/**
 * Created by vedantas on 4/7/2018.
 */
public interface UserRepository extends PagingAndSortingRepository<User, Long> {
}
