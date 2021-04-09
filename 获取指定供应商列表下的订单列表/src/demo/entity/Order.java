package demo.entity;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 11:00
 * @Description: //TODO
 */
public class Order {
    private Integer id;
    private String ordercode;
    private String ordername;
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

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
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
                ", ordername='" + ordername + '\'' +
                ", supplier='" + supplier + '\'' +
                '}';
    }
}
