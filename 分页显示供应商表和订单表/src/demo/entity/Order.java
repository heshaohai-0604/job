package demo.entity;

import java.util.Date;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 11:00
 * @Description: //TODO
 */
public class Order {
    private Integer id;
    private String ordercode;
    private Date time;
    private String supplier;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrdercode() {
        return ordercode;
    }

    public void setOrdercode(String ordercode) {
        this.ordercode = ordercode;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public Order() {
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", ordercode='" + ordercode + '\'' +
                ", time=" + time +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
