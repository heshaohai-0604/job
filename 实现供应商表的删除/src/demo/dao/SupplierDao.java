package demo.dao;

import demo.entity.Supplier;
import org.apache.ibatis.annotations.Param;

/**
 * @Auther: hsh
 * @Date: 2021/4/8 09:22
 * @Description: //TODO
 */
public interface SupplierDao {
    int deleteSuplier(@Param("id") String id);
}
