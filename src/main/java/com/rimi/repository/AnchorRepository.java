package com.rimi.repository;

import com.rimi.model.Anchor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnchorRepository extends JpaRepository<Anchor,String> {
    /**
     * 通过邮箱查找主播
     */
    public Anchor findByEmail(String email);
    /**
     * 通过手机号找主播
     */
    public Anchor findByPhoneNumber(String phoneNumber);

    public Anchor findByNickName(String nickName);
}
