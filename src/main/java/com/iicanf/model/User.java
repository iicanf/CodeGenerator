package com.iicanf.model;

import java.util.Date;
import javax.persistence.*;

public class User {
    /**
     * 用户id
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户姓名
     */
    @Column(name = "user_name")
    private String userName;

    /**
     * 用户密码
     */
    private String password;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Integer isDelete;

    /**
     * 邀请码（每个人唯一的）
     */
    @Column(name = "invite_code")
    private String inviteCode;

    /**
     * 手机号码
     */
    private String phone;

    /**
     * 加入时间
     */
    @Column(name = "insert_time")
    private Date insertTime;

    /**
     * 修改时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 是否是代理邀请注册
     */
    private Long agent;

    /**
     * 当前用户是否代理身份0,是，1，否
     */
    @Column(name = "is_agent")
    private Integer isAgent;

    private String inviter;

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户姓名
     *
     * @return user_name - 用户姓名
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置用户姓名
     *
     * @param userName 用户姓名
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * 获取用户密码
     *
     * @return password - 用户密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置用户密码
     *
     * @param password 用户密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取是否删除
     *
     * @return is_delete - 是否删除
     */
    public Integer getIsDelete() {
        return isDelete;
    }

    /**
     * 设置是否删除
     *
     * @param isDelete 是否删除
     */
    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }

    /**
     * 获取邀请码（每个人唯一的）
     *
     * @return invite_code - 邀请码（每个人唯一的）
     */
    public String getInviteCode() {
        return inviteCode;
    }

    /**
     * 设置邀请码（每个人唯一的）
     *
     * @param inviteCode 邀请码（每个人唯一的）
     */
    public void setInviteCode(String inviteCode) {
        this.inviteCode = inviteCode;
    }

    /**
     * 获取手机号码
     *
     * @return phone - 手机号码
     */
    public String getPhone() {
        return phone;
    }

    /**
     * 设置手机号码
     *
     * @param phone 手机号码
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }

    /**
     * 获取加入时间
     *
     * @return insert_time - 加入时间
     */
    public Date getInsertTime() {
        return insertTime;
    }

    /**
     * 设置加入时间
     *
     * @param insertTime 加入时间
     */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * 获取是否是代理邀请注册
     *
     * @return agent - 是否是代理邀请注册
     */
    public Long getAgent() {
        return agent;
    }

    /**
     * 设置是否是代理邀请注册
     *
     * @param agent 是否是代理邀请注册
     */
    public void setAgent(Long agent) {
        this.agent = agent;
    }

    /**
     * 获取当前用户是否代理身份0,是，1，否
     *
     * @return is_agent - 当前用户是否代理身份0,是，1，否
     */
    public Integer getIsAgent() {
        return isAgent;
    }

    /**
     * 设置当前用户是否代理身份0,是，1，否
     *
     * @param isAgent 当前用户是否代理身份0,是，1，否
     */
    public void setIsAgent(Integer isAgent) {
        this.isAgent = isAgent;
    }

    /**
     * @return inviter
     */
    public String getInviter() {
        return inviter;
    }

    /**
     * @param inviter
     */
    public void setInviter(String inviter) {
        this.inviter = inviter;
    }
}