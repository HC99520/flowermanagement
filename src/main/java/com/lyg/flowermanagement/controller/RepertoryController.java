package com.lyg.flowermanagement.controller;

import com.lyg.flowermanagement.entity.Repertory;
import com.lyg.flowermanagement.service.RepertoryService;
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
 * (Repertory)表控制层
 *
 * @author makejava
 * @since 2020-04-30 21:29:43
 */
@RestController
@RequestMapping("repertory")
@CrossOrigin("*")
public class RepertoryController {
    Log log= LogFactory.getLog(RepertoryController.class);
    /**
     * 服务对象
     */
    @Resource
    private RepertoryService repertoryService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    //根据id查询
    //测试地址:http://localhost:9000/web/repertory/selectOne?id=1
    @GetMapping("selectOne")
    public Repertory selectOne(Integer id) {

        return this.repertoryService.queryById(id);
    }
    //增加库存
    //添加操作
    //测试地址:http://localhost:9000/web/repertory/insert?shop.shopId=3&&commodity=%27%E7%8E%AB%E7%91%B0%27&&quantity=200&&surplus=200&&price=200
    // 成功  result:1
    @GetMapping("/insert")
    public Map insert(Repertory repertory ) {
        Map map= new HashMap();
        SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        repertory.setSaveDate(df1.format(new Date()));//修改时间
        Integer emp= this.repertoryService.insert(repertory);
        map.put("result",emp);
        return map;
    }

    //修改操作
    //修改全部信息测试地址:http://localhost:9000/web/repertory/update?repId=13&&shop.shopId=3&&commodity=%27%E7%8E%AB%E7%91%B0%27&&quantity=200&&surplus=200&&price=200&&saveDate=2020/04/01
     @GetMapping("/update")
    public  Map update(Repertory repertory){
        Map map= new HashMap();
         SimpleDateFormat df1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
         repertory.setSaveDate(df1.format(new Date()));
        Integer emp=  this.repertoryService.update(repertory);
        map.put("result",emp);
        return map;
    }
    //删除一条库存信息
    //测试地址:http://localhost:9000/web/repertory/delete?id=15
    //成功删除  result:1
    @GetMapping("/delete")
    public Map delete(Integer id){
        Map map= new HashMap();
        Integer emp= this.repertoryService.deleteById(id);
        map.put("result",emp);
        return map;
    }
    //无条件查询所有
    //测试地址:http://localhost:9000/web/repertory/selectAll
    @RequestMapping("/selectAll")
    public List<Repertory> selectAll(){
        List<Repertory> list= repertoryService.selectAll();
        log.info(list);
        return  list;
    }

       //根据商品名查询
    //测试地址:http://localhost:9000/web/repertory/selectByName?commodityName=红玫瑰
    @RequestMapping("/selectByName")
    public  List<Repertory> selectByName(String commodityName){
        List<Repertory> list=repertoryService.selectByName(commodityName);
        return list;
    }

}