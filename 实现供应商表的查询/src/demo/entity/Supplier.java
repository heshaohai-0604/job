package demo.entity;

/**
 * @Auther: hsh
 * @Date: 2021/4/7 20:01
 * @Description: //TODO
 */
public class Supplier {
    private Integer id;
    private String supplier;
    private String address;
    private String commodity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCommodity() {
        return commodity;
    }

    public void setCommodity(String commodity) {
        this.commodity = commodity;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", supplier='" + supplier + '\'' +
                ", address='" + address + '\'' +
                ", commodity='" + commodity + '\'' +
                '}';
    }
}
