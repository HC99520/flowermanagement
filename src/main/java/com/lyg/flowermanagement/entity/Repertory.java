package com.lyg.flowermanagement.entity;

import java.util.Date;
import java.io.Serializable;

/**
 * (Repertory)实体类
 *
 * @author makejava
 * @since 2020-04-30 21:16:06
 */
public class Repertory implements Serializable {
    private static final long serialVersionUID = -20770430118343686L;
    /**
    * 库存id
    */
    private Integer repId;
    /**
    * 店铺id
    */
    private Shop shop;
    /**
    * 商品名
    */
    private String commodity;
    /**
    * 总数量
    */
    private Integer quantity;
    /**
    * 剩余数量
    */
    private Integer surplus;
    /**
    * 单价
    */
    private float price;
    /**
    * 保存时间
    */
    private String saveDate;


    public Integer getRepId() {
        return repId;
    }

    public void setRepId(Integer repId) {
        this.repId = repId;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Integer getSurplus() {
        return surplus;
    }

    public void setSurplus(Integer surplus) {
        this.surplus = surplus;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String  getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(String saveDate) {
        this.saveDate = saveDate;
    }

}