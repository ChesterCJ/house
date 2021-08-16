package com.tuying.model;

/**
 * @author chenjun
 * @version 1.0
 * @date 2021/8/16
 */
public class Users {

    //用户ID
    private Long userId;
    //用户名
    private String userName;
    //真实姓名
    private String realName;
    //手机号码
    private String mobilePhone;
    //年龄
    private Integer age;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Users{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", realName='" + realName + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", age=" + age +
                '}';
    }
}
