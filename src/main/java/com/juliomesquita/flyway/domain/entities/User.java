package com.juliomesquita.flyway.domain.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "tb_users")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id", nullable = false)
    private Long id;

    @Column(name = "user_name")
    private String name;

    @Column(name = "user_age")
    private Integer age;

    @Column(name = "user_email", length = 100)
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
    private List<Post> posts;
}
