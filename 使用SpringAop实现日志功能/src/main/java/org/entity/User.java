package org.entity;

/**
 * @Auther: hsh
 * @Date: 2021/4/9 11:03
 * @Description: //TODO
 */
public class User {
    private String name;
    private String password;
    private String job;
    private Integer sex;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public User() {
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", job='" + job + '\'' +
                ", sex=" + sex +
                '}';
    }
}
