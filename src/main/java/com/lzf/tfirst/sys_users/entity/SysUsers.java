package com.lzf.tfirst.sys_users.entity;
import java.math.BigDecimal;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.lzf.tfirst.config.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;
/**
 * <p>
 * 用户表
 * </p>
 *
 * @author lzf
 * @since 2019-12-05
 */
@TableName("sys_users")
public class SysUsers extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * 用户编码
     */
    @TableId("USER_ID")
    private String userId;

    /**
     * 用户名称
     */
    @TableField("USER_NAME")
    private String userName;

    /**
     * 密码
     */
    @TableField("PASSWORD")
    private String password;

    /**
     * 状态(0:锁定;1:开放;2删除)
     */
    @TableField("ACCOUNT_STATUS")
    private String accountStatus;

    @TableField("SECURITY_LEVEL")
    private Integer securityLevel;

    @TableField("MAX_SESSIONS")
    private Integer maxSessions;

    /**
     * 是否系统管理员
     */
    @TableField("IS_SYS")
    private String isSys;

    /**
     * 是否公司级公用账号
     */
    @TableField("IS_CPUBLIC")
    private String isCpublic;

    /**
     * 创建时间
     */
    @TableField("CREATE_TIME")
    private LocalDateTime createTime;

    /**
     * 锁定时间
     */
    @TableField("LOCK_TIME")
    private LocalDateTime lockTime;

    /**
     * 失效时间
     */
    @TableField("EXPIRED_TIME")
    private LocalDateTime expiredTime;

    /**
     * 上次密码修改时间
     */
    @TableField("PSWD_UPT_TIME")
    private LocalDateTime pswdUptTime;

    /**
     * 密码失效时间
     */
    @TableField("PSWD_TIME")
    private LocalDateTime pswdTime;

    /**
     * 公司结构编码
     */
    @TableField("CORPORATION_ID")
    private String corporationId;

    /**
     * 部门结构编码
     */
    @TableField("DEPARTMENT_ID")
    private String departmentId;

    /**
     * 员工结构编码
     */
    @TableField("EMPLOYEE_ID")
    private String employeeId;

    /**
     * 电子邮件
     */
    @TableField("E_MAIL")
    private String eMail;

    /**
     * 微信
     */
    @TableField("WECHAT")
    private String wechat;

    /**
     * 电话
     */
    @TableField("TELEPHONE")
    private String telephone;

    /**
     * 手机
     */
    @TableField("MOBILE")
    private String mobile;

    @TableField("CHAR_1")
    private String char1;

    @TableField("CHAR_2")
    private String char2;

    @TableField("NUM_1")
    private Integer num1;

    @TableField("NUM_2")
    private Integer num2;

    /**
     * 权限组织结构编码
     */
    @TableField("PERMISSION_STRU_ID")
    private String permissionStruId;

    /**
     * 用户排序序号
     */
    @TableField("USER_ORDER")
    private BigDecimal userOrder;

    /**
     * 行政区代码
     */
    @TableField("PROVINCE_CODE")
    private String provinceCode;

    /**
     * 用户登录账号
     */
    @TableField("USER_ACCOUNT")
    private String userAccount;



    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public Integer getSecurityLevel() {
        return securityLevel;
    }

    public void setSecurityLevel(Integer securityLevel) {
        this.securityLevel = securityLevel;
    }

    public Integer getMaxSessions() {
        return maxSessions;
    }

    public void setMaxSessions(Integer maxSessions) {
        this.maxSessions = maxSessions;
    }

    public String getIsSys() {
        return isSys;
    }

    public void setIsSys(String isSys) {
        this.isSys = isSys;
    }

    public String getIsCpublic() {
        return isCpublic;
    }

    public void setIsCpublic(String isCpublic) {
        this.isCpublic = isCpublic;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getLockTime() {
        return lockTime;
    }

    public void setLockTime(LocalDateTime lockTime) {
        this.lockTime = lockTime;
    }

    public LocalDateTime getExpiredTime() {
        return expiredTime;
    }

    public void setExpiredTime(LocalDateTime expiredTime) {
        this.expiredTime = expiredTime;
    }

    public LocalDateTime getPswdUptTime() {
        return pswdUptTime;
    }

    public void setPswdUptTime(LocalDateTime pswdUptTime) {
        this.pswdUptTime = pswdUptTime;
    }

    public LocalDateTime getPswdTime() {
        return pswdTime;
    }

    public void setPswdTime(LocalDateTime pswdTime) {
        this.pswdTime = pswdTime;
    }

    public String getCorporationId() {
        return corporationId;
    }

    public void setCorporationId(String corporationId) {
        this.corporationId = corporationId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getChar1() {
        return char1;
    }

    public void setChar1(String char1) {
        this.char1 = char1;
    }

    public String getChar2() {
        return char2;
    }

    public void setChar2(String char2) {
        this.char2 = char2;
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

    public String getPermissionStruId() {
        return permissionStruId;
    }

    public void setPermissionStruId(String permissionStruId) {
        this.permissionStruId = permissionStruId;
    }

    public BigDecimal getUserOrder() {
        return userOrder;
    }

    public void setUserOrder(BigDecimal userOrder) {
        this.userOrder = userOrder;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    @Override
    public String toString() {
        return "SysUsers{" +
        ", userId=" + userId +
        ", userName=" + userName +
        ", password=" + password +
        ", accountStatus=" + accountStatus +
        ", securityLevel=" + securityLevel +
        ", maxSessions=" + maxSessions +
        ", isSys=" + isSys +
        ", isCpublic=" + isCpublic +
        ", createTime=" + createTime +
        ", lockTime=" + lockTime +
        ", expiredTime=" + expiredTime +
        ", pswdUptTime=" + pswdUptTime +
        ", pswdTime=" + pswdTime +
        ", corporationId=" + corporationId +
        ", departmentId=" + departmentId +
        ", employeeId=" + employeeId +
        ", eMail=" + eMail +
        ", wechat=" + wechat +
        ", telephone=" + telephone +
        ", mobile=" + mobile +
        ", char1=" + char1 +
        ", char2=" + char2 +
        ", num1=" + num1 +
        ", num2=" + num2 +
        ", permissionStruId=" + permissionStruId +
        ", userOrder=" + userOrder +
        ", provinceCode=" + provinceCode +
        ", userAccount=" + userAccount +
        "}";
    }
}
