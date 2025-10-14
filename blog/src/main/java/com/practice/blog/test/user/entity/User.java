package com.practice.blog.test.user.entity;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EntityListeners(AuditingEntityListener.class)
@Entity
@Table(name = "USER")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Setter
    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false, unique = true)
    private String email;

    @CreatedDate
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    // 도메인 메서드
    public void changeName(String newName) {
        this.name = newName;
    }

    public void changeRole(Role newRole) {
        this.role = newRole;
    }
}
