package com.lsd.app.test.function;

import com.lsd.app.test.service.Test1MySQLService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/29 11:22
 */
@RestController
public class Test1MySQLFunction {

    /**测试mybatis链接数据库*/
    @Autowired
    private Test1MySQLService mySQLServer;

    @RequestMapping("/queryDataTest")
    public Object test1(){
      Map<String,Object> map = new HashMap<>();
        map = mySQLServer.queryDataTest();
      return map;
    }
    @RequestMapping("/queryDataTest2")
    public Object test2(){
        Map<String,Object> map = new HashMap<>();
        map = mySQLServer.queryDataTest2();
        return map;
    }
    @RequestMapping("/queryDataTest3")
    public Object test3(){
        Map<String,Object> map = new HashMap<>();
        map = mySQLServer.queryDataTest3();
        return map;
    }
}

