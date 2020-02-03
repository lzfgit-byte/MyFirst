package com.lzf.tfirst.sys_permission.service;

import com.lzf.tfirst.sys_permission.entity.SysPermission;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
public interface ISysPermissionService extends IService<SysPermission> {
    List<String> selectPermissionByUserId(Long id);
}
