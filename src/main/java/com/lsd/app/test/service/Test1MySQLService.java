package com.lsd.app.test.service;

import com.lsd.app.test.mapper.test.Test1MySQLMapper;
import com.lsd.app.test.pojo.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/29 11:25
 */
@Service
public class Test1MySQLService {

    @Autowired
    public Test1MySQLMapper test1MySQLMapper;

    public Map<String,Object> queryDataTest() {
        Map<String,Object> map = new HashMap<>();

        List<Employees> employeesList = new ArrayList<>();
        try{
            employeesList = test1MySQLMapper.queryDataTest();
        }catch (Exception e){
            map.put("error",e.getMessage());
        }
        map.put("employeesList",employeesList);
        return map;
    }

    public Map<String, Object> queryDataTest2() {
        Map<String,Object> map = new HashMap<>();

        Date  date= test1MySQLMapper.queryDataTest2();

        map.put("date",date);
        return map;
    }


    public Map<String, Object> queryDataTest3() {
        Map<String,Object> map = new HashMap<>();
        map.put("date","3030-03-03");
        return map;
    }
}
