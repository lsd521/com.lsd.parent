package com.lsd.app.test.service;

import com.alibaba.fastjson.JSON;
import com.lsd.app.test.mapper.Test1MySQLMapper;
import com.lsd.app.test.pojo.Employees;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/29 11:25
 */
@Service
public class Test1MySQLService {

    Logger logger = LogManager.getLogger(LogManager.ROOT_LOGGER_NAME);

    @Autowired
    public Test1MySQLMapper test1MySQLMapper;

    public Map<String,Object> queryDataTest() {
        Map<String,Object> map = new HashMap<>();

        List<Employees> employeesList = new ArrayList<>();
        try{
            employeesList = test1MySQLMapper.queryDataTest();
            logger.info("查询成功Test--->"+JSON.toJSONString(employeesList));
        }catch (Exception e){
            map.put("error",e.getMessage());
        }

        map.put("employeesList",employeesList);
        return map;
    }

    public Map<String, Object> queryDataTest2() {
        Map<String,Object> map = new HashMap<>();

        Date  date= test1MySQLMapper.queryDataTest2();
        logger.info("查询日期Test2--->"+date);
        String date1 = new SimpleDateFormat("yyyy-MM-dd").format(date);
        logger.info("格式化日期Test2--->"+date1);
        map.put("date",date1);
        return map;
    }

    /**测试阿里的fastJson*/
    public Map<String, Object> queryDataTest3() {
        Map<String,Object> map = new HashMap<>();
        map.put("date","3030-03-03");
        logger.info("查询成功Test3--->"+ JSON.toJSONString(map));
        return map;
    }


}
