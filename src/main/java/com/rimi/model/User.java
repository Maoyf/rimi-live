package com.rimi.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.sql.Timestamp;

@Entity
@Table(name = "user_tb")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private String id;
    @Column(unique = true)
    private String email;
    @Column(nullable = false)
    private String nickname;
    private String headimg;
    private String balance;
    private String medal;
    private Integer status;
    private Timestamp ctratetime;
}