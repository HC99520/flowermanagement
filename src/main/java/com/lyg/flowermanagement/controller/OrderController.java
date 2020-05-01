package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Order;
import com.lyg.flowermanagement.entity.Repertory;
import com.lyg.flowermanagement.service.OrderService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * (Order)表控制层
 *
 * @author makejava
 * @since 2020-05-01 10:04:47
 */
@RestController
@RequestMapping("order")
public class OrderController {
    Log log= LogFactory.getLog(OrderController.class);
    /**
     * 服务对象
     */
    @Resource
    private OrderService orderService;

    /**
     * 通过主键查询单条数据
     *测试地址:
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Order selectOne(Integer id) {
        return this.orderService.queryById(id);
    }

    //添加操作
    //测试地址:http://localhost:9000/web/order/insert?ordId=222&&shop.shopId=22&&employee.empId=33&&commodity=11&&price=33&&quantity=444&&totalPrice=33&&name=55&&tel=33&&address=33&&remarks=66
    @GetMapping("/insert")
    public Map insert(Order order ) {
        Map map= new HashMap();
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        order.setSaveDate(df1.format(new Date()));//修改时间
        Integer emp= this.orderService.insert(order);
        map.put("result",emp);
        return map;
    }
    //修改信息
    //测试地址:http://localhost:9000/web/order/update?ordId=222&&shop.shopId=66&&employee.empId=336&&commodity=161&&price=363&&quantity=4644&&totalPrice=363&&name=565&&tel=363&&address=363&&remarks=666
    @GetMapping("/update")
    public  Map update(Order order){
        Map map= new HashMap();
        Integer emp=  this.orderService.update(order);
        map.put("result",emp);
        return map;
    }
    //成功删除  result:1
    //测试地址:http://localhost:9000/web/order/delete?id=222
    @GetMapping("/delete")
    public Map delete(Integer id){
        Map map= new HashMap();
        Integer emp= this.orderService.deleteById(id);
        map.put("result",emp);
        return map;
    }
    //无条件查询所有
    //测试地址:http://localhost:9000/web/order/selectAll
    @RequestMapping("/selectAll")
    public List<Order> selectAll(){
        List<Order> list= orderService.selectAll();
        log.info(list);
        return  list;
    }
}