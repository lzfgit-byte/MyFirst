package com.lzf.tfirst.sys_users.service;

import com.lzf.tfirst.sys_users.entity.SysUsers;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author lzf
 * @since 2019-12-05
 */
public interface ISysUsersService extends IService<SysUsers> {
    String getId(int id);
    String getId2(int id);
}
