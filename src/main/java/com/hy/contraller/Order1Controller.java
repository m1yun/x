package com.hy.contraller;

import com.hy.service.impl.Order1ServiceImpl;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/*

  植树造法 

*/
@RestController
public class Order1Controller {

    @Resource
    private Order1ServiceImpl order1Service;
    @RequestMapping("/b")
    public String addOrder(){
        return order1Service.add()+"";
    }
}
