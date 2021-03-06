package com.rimi.repository;

import com.rimi.model.Manager;
import com.rimi.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,String> {
    /**
     * 通过邮箱查找用户
     */
    public User findByEmail(String email);
    /**
     * 通过昵称找到用户
     */
    public User findByNickName(String nickName);

    public User findOneById(String id);

    public Page<User>  findByStatus(int status, Pageable pageable);
}