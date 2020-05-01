package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Employee;
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

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    //修改商品信息
    //测试地址：http://localhost:9000/web/ShopController/update?shopId=4&&name=33&&address=44
    @GetMapping("/update")
    public Map update(Shop shop){
        Map map= new HashMap();
        Integer emp=  this.shopService.update(shop);
        map.put("result",emp);
        return map;
    }
    //根据id删除
    //测试地址:http://localhost:9000/web/ShopController/delete?shopId=4
    @GetMapping("/delete")
    public Map delete(Integer shopId){
        Map map= new HashMap();
        Integer emp= this.shopService.deleteById(shopId);
        map.put("result",emp);
        return map;
    }
    //新增操作
    //测试地址:http://localhost:9000/web/ShopController/insert?shopId=5&&name=22&&address=44
    @GetMapping("/insert")
    public Map insert(Shop shop) {
        Map map= new HashMap();
        Integer emp= this.shopService.insert(shop);
        map.put("result",emp);
        return map;
    }
}
