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
    @Column(nullable = false,name = "nick_name")
    private String nickName;
    private String password;
    @Column(name = "head_img")
    private String headImg;
    private String balance = "0";
    private String medal;
    //0代表未激活 1代表在线上 2代表线下 3代表用户冻结
    private Integer status;
    @Column(name = "create_time")
    private Timestamp createTime;
    @Column(nullable = false)
    private int gender;
}