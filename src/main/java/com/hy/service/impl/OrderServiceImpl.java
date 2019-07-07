package com.hy.service.impl;

import com.hy.entity.Order;
import com.hy.mapper.OrderMapper;
import com.hy.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.SQLException;

/*

  植树造法 

*/
@Service("orderServiceImpl")
public class OrderServiceImpl implements OrderService {
    @Resource
    private OrderMapper orderDao;
    public int addOrder(Order order)  {
         return orderDao.addsss(order);
    }
}
