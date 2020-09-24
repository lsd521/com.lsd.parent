package com.lsd.app.testJspAndHtml.function;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Liu ShaoDong
 * @Date 2020/9/24 21:01
 */
@Controller
public class Test1Function {

    @RequestMapping("/index")
    public ModelAndView test1(){
        return new ModelAndView("index");
    }
}
