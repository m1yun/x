package com.hy.contraller;

import com.hy.entity.Order;
import com.hy.service.OrderService;
import com.hy.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;
import java.sql.SQLException;

/*

  植树造法 

*/
@RestController
public class OrderContraller {
    @Autowired
    private OrderServiceImpl orderServiceImpl;

    @RequestMapping("/a")
    public String add(@RequestParam Order order)  {
         return orderServiceImpl.addOrder(order)+"";

    }



}
