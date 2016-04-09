package com.demo.share.web.controller;

import com.demo.dubbo.client.DubboRegisterClient;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;

@Controller
@RequestMapping("/one")
public class IndexController {

    @Resource
    private DubboRegisterClient dubboRegisterClient;

    @RequestMapping("/showView")
    @ResponseBody()
    public ModelAndView showView() {

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("viewName");
        modelAndView.addObject(" 需要放到 model 中的属性名称 ", dubboRegisterClient.SayHello("name"));

        return modelAndView;

    }

}
