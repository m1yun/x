package com.hy.mapper;


import com.hy.entity.Order;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/*

  植树造法 

*/
@Mapper
public interface OrderMapper {

  int addsss(Order order);
}
