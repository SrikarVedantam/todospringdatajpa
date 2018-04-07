package com.srikar.spring.data.jpa.todo.domain;

import javax.persistence.*;
import java.util.List;

/**
 * Created by vedantas on 4/7/2018.
 */
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String userid;
    private String name;
    @OneToMany(mappedBy = "user")
    private List<Todo> todos;

    public User() {

    }

    public Long getId() {
        return id;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Todo> getTodos() {
        return todos;
    }

    public void setTodos(List<Todo> todos) {
        this.todos = todos;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userid='" + userid + '\'' +
                ", name='" + name + '\'' +
                ", todos=" + todos +
                '}';
    }
}

