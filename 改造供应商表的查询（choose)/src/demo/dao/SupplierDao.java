package demo.dao;

import demo.entity.Supplier;

import java.util.List;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 09:22
 * @Description: //TODO
 */
public interface SupplierDao {
    List<Supplier> selectSupplier(Supplier supplier);
}
