package com.lsd.app.login.function;

import com.lsd.app.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author Liu ShaoDong
 * @Date 2020/10/9 14:03
 */
@Controller
public class LoginFunction {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/loginIndex")
    public ModelAndView index(){
        ModelAndView view = new ModelAndView("index");
        return view;
    }
    @RequestMapping("/loginIndex1")
    public String index1(){
        return "index";
    }
}
