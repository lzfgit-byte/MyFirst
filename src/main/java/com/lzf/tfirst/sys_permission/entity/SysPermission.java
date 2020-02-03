package com.lzf.tfirst.sys_permission.entity;
import com.baomidou.mybatisplus.annotation.TableId;
import com.lzf.tfirst.config.BaseEntity;
import com.baomidou.mybatisplus.annotation.TableName;
/**
 * <p>
 * 
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
@TableName("sys_permission")
public class SysPermission extends BaseEntity{

    private static final long serialVersionUID = 1L;
    @TableId("PARENT_ID")
    private Long parentId;

    private String resName;

    private String resType;

    private String permission;

    private String url;

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public String getResName() {
        return resName;
    }

    public void setResName(String resName) {
        this.resName = resName;
    }

    public String getResType() {
        return resType;
    }

    public void setResType(String resType) {
        this.resType = resType;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "SysPermission{" +
        ", parentId=" + parentId +
        ", resName=" + resName +
        ", resType=" + resType +
        ", permission=" + permission +
        ", url=" + url +
        "}";
    }
}
