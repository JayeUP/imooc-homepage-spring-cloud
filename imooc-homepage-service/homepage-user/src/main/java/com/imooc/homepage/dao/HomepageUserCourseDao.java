package com.imooc.homepage.dao;

import com.imooc.homepage.entity.HomepageUserCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface HomepageUserCourseDao extends JpaRepository<HomepageUserCourse, Long> {

    /**
     * <h2>通过用户id寻找数据记录</h2>
     */
    List<HomepageUserCourse> findAllByUserId(Long userId);
}
