package com.hy.service.impl;

import com.hy.mapper.Order1Mapper;
import com.hy.service.Order1Service;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/*

  植树造法 

*/
@Service
public class Order1ServiceImpl implements Order1Service {
    @Resource
    private Order1Mapper order1Mapper;
    public int add() {
        return order1Mapper.addOrder1();
    }
}
