package com.demo.security.springsecurityauthserver.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "[user]")
@NoArgsConstructor @Getter @Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String email;

    private String name;
    private String password;
    private String lastName;
    private int active;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns =
    @JoinColumn(name = "user_id"), inverseJoinColumns =
    @JoinColumn(name = "role_id"))
    private Set<Role> roles;

    public User(User user) {

        this.active = user.active;
        this.email = user.email;
        this.id = user.id;
        this.lastName = user.lastName;
        this.name = user.name;
        this.password = user.password;
        this.roles = user.roles;

    }

}
