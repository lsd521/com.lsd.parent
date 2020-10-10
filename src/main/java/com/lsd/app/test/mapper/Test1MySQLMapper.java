package com.lsd.app.test.mapper;

import com.lsd.app.test.pojo.Employees;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/29 13:51
 */

@Mapper
public interface Test1MySQLMapper {

    /**测试mybatis链接数据库*/
    List<Employees> queryDataTest();

    Date queryDataTest2();
}
