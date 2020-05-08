package com.lyg.flowermanagement.entity;
import java.io.Serializable;

/**
 * (Order)实体类
 *
 * @author makejava
 * @since 2020-05-01 09:54:11
 */
public class Order implements Serializable {
    private static final long serialVersionUID = -40437321154791394L;
    //订单ID
    private Integer ordId;
    /**
    * 店铺id
    */
    private Shop shop;
    /**
    * 员工id
    */
    private Employee employee;
    /**
    * 商品
    */
    private String commodity;
    /**
    * 单价
    */
    private Double price;
    /**
    * 数量
    */
    private Integer quantity;
    /**
    * 总价
    */
    private Double totalPrice;
    /**
    * 客户姓名
    */
    private String name;
    /**
    * 手机号
    */
    private String tel;
    /**
    * 地址
    */
    private String address;
    /**
    * 备注
    */
    private String remarks;
    /**
    * 保存时间
    */
    private String saveDate;


    public Integer getOrdId() {
        return ordId;
    }

    public void setOrdId(Integer ordId) {
        this.ordId = ordId;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getSaveDate() {
        return saveDate;
    }

    public void setSaveDate(String saveDate) {
        this.saveDate = saveDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "ordId=" + ordId +
                ", shop=" + shop +
                ", employee=" + employee +
                ", commodity='" + commodity + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", totalPrice=" + totalPrice +
                ", name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", address='" + address + '\'' +
                ", remarks='" + remarks + '\'' +
                ", saveDate='" + saveDate + '\'' +
                '}';
    }
}