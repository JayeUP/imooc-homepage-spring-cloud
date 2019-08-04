package com.imooc.homepage.service;

import com.imooc.homepage.CourseInfo;
import com.imooc.homepage.CourseInfosRequest;

import java.util.List;

/**
 * <h1>课程相关服务接口定义</h1>
 */
public interface ICourseService {

    /** 通过id获取课程信息 */
    CourseInfo getCourseInfo(Long id);

    /** 通过ids获取课程信息 */
    List<CourseInfo> getCourseInfos(CourseInfosRequest request);
}
