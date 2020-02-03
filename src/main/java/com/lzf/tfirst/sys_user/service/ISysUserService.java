package com.lzf.tfirst.sys_user.service;

import com.lzf.tfirst.sys_user.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author lzf
 * @since 2019-12-02
 */
public interface ISysUserService extends IService<SysUser> {
    SysUser findByUserName(String username);
    List<SysUser> selectAll(int a);
}
