package com.juliomesquita.flyway.domain.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tb_posts")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "post_id", nullable = false)
    private Long id;

    @Column(name = "post_content", nullable = false, length = 1000)
    private String content;

    @Column(name = "post_like")
    private Boolean like;

    @ManyToOne
    @JoinColumn(name = "post_user_id", referencedColumnName = "user_id")
    private User user;
}
