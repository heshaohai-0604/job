package org.dao.impl;

import org.dao.UserDao;
import org.entity.User;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:01
 * @Description: //TODO
 */
public class UserDaoImpl implements UserDao {
    @Override
    public String preserve(User user) {
        System.out.println("保存成功");
        System.out.println(user.toString());
        return "成功! ! !";
    }
}
