package com.lzf.tfirst.lxs_contract.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import java.time.LocalDateTime;
import com.baomidou.mybatisplus.annotation.TableField;
import com.lzf.tfirst.config.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * 合同管理
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
@TableName("lxs_contract")
public class LxsContract extends BaseEntity{

    private static final long serialVersionUID = 1L;

    /**
     * ID
     */
    @TableId("CONTRACT_ID")
    private String contractId;

    /**
     * 团号
     */
    @TableField("REGIMENT_NUMBER")
    private String regimentNumber;

    /**
     * 业务类型
     */
    @TableField("BUSINESS_TYPE")
    private String businessType;

    /**
     * 对应主单管理的类型（取字典项）
     */
    @TableField("TYPE")
    private String type;

    /**
     * 对应主单管理的类别（取字典项）
     */
    @TableField("CATEGORY")
    private String category;

    /**
     * 对应主单管理的方式（取字典项）
     */
    @TableField("MODE")
    private String mode;

    /**
     * 合同号
     */
    @TableField("CONTRACT_NUM")
    private String contractNum;

    /**
     * 合同名称
     */
    @TableField("CONTRACT_NAME")
    private String contractName;

    /**
     * 合同金额
     */
    @TableField("CONTRACT_AMOUNT")
    private Double contractAmount;

    /**
     * 客户名称(游客显示游客ID，供应商显示供应商ID)
     */
    @TableField("CUSTOMER_NAME")
    private String customerName;

    /**
     * 合同类别（取字典项）
     */
    @TableField("CONTRACT_CATEGORY")
    private String contractCategory;

    /**
     * 附件
     */
    @TableField("ENCLOSURE")
    private String enclosure;

    /**
     * 模板名称
     */
    @TableField("TEMPLATE_NAME")
    private String templateName;

    /**
     * 模板ID
     */
    @TableField("CONTRACTTEMPLATE_ID")
    private String contracttemplateId;

    /**
     * 合同内容
     */
    @TableField("CONTENT")
    private String content;

    /**
     * 默认当前登入人ID
     */
    @TableField("REGISTRAR")
    private String registrar;

    /**
     * 登记部门(当前登记人对应的部门ID)
     */
    @TableField("REGISTRAR_DEP")
    private String registrarDep;

    /**
     * 登记日期
     */
    @TableField("REGISTRAR_DATE")
    private String registrarDate;

    /**
     * 是否终止(0 终止，1没有终止)
     */
    @TableField("ISDEAD")
    private String isdead;

    /**
     * 审核状态
     */
    @TableField("AUDIT_STATE")
    private String auditState;

    /**
     * 创建人
     */
    @TableField("CREATEUSER")
    private String createuser;

    /**
     * 创建人ID
     */
    @TableField("CREATEUSER_ID")
    private String createuserId;

    /**
     * 创建人单位
     */
    @TableField("CREATEORG_ID")
    private String createorgId;

    /**
     * 创建人部门
     */
    @TableField("CREATEDEPT_ID")
    private String createdeptId;

    /**
     * 创建时间
     */
    @TableField("CREATEDATE")
    private LocalDateTime createdate;

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getRegimentNumber() {
        return regimentNumber;
    }

    public void setRegimentNumber(String regimentNumber) {
        this.regimentNumber = regimentNumber;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getContractNum() {
        return contractNum;
    }

    public void setContractNum(String contractNum) {
        this.contractNum = contractNum;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public Double getContractAmount() {
        return contractAmount;
    }

    public void setContractAmount(Double contractAmount) {
        this.contractAmount = contractAmount;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContractCategory() {
        return contractCategory;
    }

    public void setContractCategory(String contractCategory) {
        this.contractCategory = contractCategory;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getContracttemplateId() {
        return contracttemplateId;
    }

    public void setContracttemplateId(String contracttemplateId) {
        this.contracttemplateId = contracttemplateId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getRegistrar() {
        return registrar;
    }

    public void setRegistrar(String registrar) {
        this.registrar = registrar;
    }

    public String getRegistrarDep() {
        return registrarDep;
    }

    public void setRegistrarDep(String registrarDep) {
        this.registrarDep = registrarDep;
    }

    public String getRegistrarDate() {
        return registrarDate;
    }

    public void setRegistrarDate(String registrarDate) {
        this.registrarDate = registrarDate;
    }

    public String getIsdead() {
        return isdead;
    }

    public void setIsdead(String isdead) {
        this.isdead = isdead;
    }

    public String getAuditState() {
        return auditState;
    }

    public void setAuditState(String auditState) {
        this.auditState = auditState;
    }

    public String getCreateuser() {
        return createuser;
    }

    public void setCreateuser(String createuser) {
        this.createuser = createuser;
    }

    public String getCreateuserId() {
        return createuserId;
    }

    public void setCreateuserId(String createuserId) {
        this.createuserId = createuserId;
    }

    public String getCreateorgId() {
        return createorgId;
    }

    public void setCreateorgId(String createorgId) {
        this.createorgId = createorgId;
    }

    public String getCreatedeptId() {
        return createdeptId;
    }

    public void setCreatedeptId(String createdeptId) {
        this.createdeptId = createdeptId;
    }

    public LocalDateTime getCreatedate() {
        return createdate;
    }

    public void setCreatedate(LocalDateTime createdate) {
        this.createdate = createdate;
    }

    @Override
    public String toString() {
        return "LxsContract{" +
        ", contractId=" + contractId +
        ", regimentNumber=" + regimentNumber +
        ", businessType=" + businessType +
        ", type=" + type +
        ", category=" + category +
        ", mode=" + mode +
        ", contractNum=" + contractNum +
        ", contractName=" + contractName +
        ", contractAmount=" + contractAmount +
        ", customerName=" + customerName +
        ", contractCategory=" + contractCategory +
        ", enclosure=" + enclosure +
        ", templateName=" + templateName +
        ", contracttemplateId=" + contracttemplateId +
        ", content=" + content +
        ", registrar=" + registrar +
        ", registrarDep=" + registrarDep +
        ", registrarDate=" + registrarDate +
        ", isdead=" + isdead +
        ", auditState=" + auditState +
        ", createuser=" + createuser +
        ", createuserId=" + createuserId +
        ", createorgId=" + createorgId +
        ", createdeptId=" + createdeptId +
        ", createdate=" + createdate +
        "}";
    }
}
