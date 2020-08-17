package cn.design.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhangkun
 * @create 2020-07-06 2:26 PM
 * @desc
 **/
@RestController
@RequestMapping("/test/")
public class testController {

    @ResponseBody
    @RequestMapping("test1")
    public String test1(){
        return "test";
    }

}
