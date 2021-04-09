package org.dao.impl;

import org.dao.UserDao;
import org.entity.User;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:48
 * @Description: //TODO
 */
public class UserDaoImpl implements UserDao {

    public String save(User user) {
        System.out.println("保存成功！！！");
        System.out.println("保存信息如下：" +user.toString());
        return null;
    }
}
