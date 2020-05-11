package com.lyg.flowermanagement.mapper;

import com.lyg.flowermanagement.entity.Repertory;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Repertory)表数据库访问层
 *
 * @author makejava
 * @since 2020-04-30 21:18:38
 */
@Mapper
public interface IRepertoryMapper {

    /**
     * 通过ID查询单条数据
     *
     * @param repId 主键
     * @return 实例对象
     */
    Repertory queryById(Integer repId);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Repertory> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param repertory 实例对象
     * @return 对象列表
     */
    List<Repertory> queryAll(Repertory repertory);

    /**
     * 新增数据
     *
     * @param repertory 实例对象
     * @return 影响行数
     */
    int insert(Repertory repertory);

    /**
     * 修改数据
     *
     * @param repertory 实例对象
     * @return 影响行数
     */
    int update(Repertory repertory);

    /**
     * 通过主键删除数据
     *
     * @param repId 主键
     * @return 影响行数
     */
    int deleteById(Integer repId);


    //无条件查询所有
    List<Repertory> selectAll();
     // 根据商品名查询
    List<Repertory> selectByName(@Param("commodityName") String commodityName);
    //根据店铺名称查看库存信息
    List<Repertory> selectByShopName(@Param("shopName")String shopName);

}