package org.service.impl;

import org.dao.UserDao;
import org.entity.User;
import org.service.UserService;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:02
 * @Description: //TODO
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * @Author hsh
     * @Date 11:09 2021/4/9
     * @Param
     * @return
     * @Description //TODO 添加用户
     **/
    @Override
    public String add(User user) {
        return userDao.preserve(user);
    }
}
