package com.lsd.app.testJspAndHtml.function;

import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/26 22:09
 */
@Controller
public class test2Function extends SpringBootServletInitializer {

    @RequestMapping("/index2")
    public Object  test1(){
        return "appIndex";
    }

    @ResponseBody
    @RequestMapping("/index3")
    public Object  test2(){
        return "appIndex";
    }

    @ResponseBody
    @RequestMapping("/index4")
    public Object  test4(){
        Map<String,String> map = new HashMap<>();
        map.put("name","lsd");
        map.put("age","18");
        return map;
    }

}
