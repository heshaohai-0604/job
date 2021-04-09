package org.service.impl;

import org.dao.UserDao;
import org.entity.User;
import org.service.UserService;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:51
 * @Description: //TODO
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    /**
     * @Author hsh
     * @Date 13:31 2021/4/9
     * @Param
     * @return
     * @Description //TODO 增加用户
     **/
    public String addUser(User user) {

        return userDao.save(user);
    }
}
