package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Repertory;
import com.lyg.flowermanagement.entity.Shop;
import com.lyg.flowermanagement.service.ShopService;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ShopController")
@CrossOrigin("*")
public class ShopController {
    Log log= LogFactory.getLog(EmployeeController.class);
    @Autowired
    ShopService shopService;
    //查看店铺的id和店铺名称
    //测试地址:http://localhost:9000/web/ShopController/findByIdAndName
    @GetMapping("/findByIdAndName")
    public List<Shop> findByIdAndName(Shop shop){
            List list=this.shopService.findByIdAndName(shop);
        log.info(list);
        return list;

    }
    //测试地址：http://localhost:9000/web/ShopController/selectOne?id=1
    @GetMapping("selectOne")
    public Shop selectOne(Integer id) {

        return this.shopService.queryById(id);
    }
}
