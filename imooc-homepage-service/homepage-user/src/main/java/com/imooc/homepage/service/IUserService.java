package com.imooc.homepage.service;

import com.imooc.homepage.UserInfo;
import com.imooc.homepage.vo.CreateUserRequest;
import com.imooc.homepage.vo.UserCourseInfo;

/**
 * <h1>用户相关服务接口定义</h1>
 */
public interface IUserService {

    /**
     * <h2>创建用户</h2>
     * @param request
     * @return
     */
    UserInfo createUser(CreateUserRequest request);

    /**
     * <h2>根据 id 获取用户信息</h2>
     */
    UserInfo getUserInfo(Long id);

    /**
     * <h2>获取用户和课程信息</h2>
     * @param id
     * @return
     */
    UserCourseInfo getUserCourseInfo(Long id);
}
