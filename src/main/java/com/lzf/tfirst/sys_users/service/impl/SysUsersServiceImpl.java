package com.lzf.tfirst.sys_users.service.impl;

import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_user.mapper.SysUserMapper;
import com.lzf.tfirst.sys_users.entity.SysUsers;
import com.lzf.tfirst.sys_users.mapper.SysUsersMapper;
import com.lzf.tfirst.sys_users.service.ISysUsersService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author lzf
 * @since 2019-12-05
 */
@Service
public class SysUsersServiceImpl extends ServiceImpl<SysUsersMapper, SysUsers> implements ISysUsersService {
    @Resource
    SysUserMapper sysUserMapper;

    @Cacheable(value = "users",key = "#p0")
    @Override
    public String getId(int id) {
        List<SysUser> sysUsers = sysUserMapper.selectAll();
        System.err.println("没有使用缓存");
        return id+"";
    }

    @Cacheable(value = "permission",key = "#p0")
    @Override
    public String getId2(int id) {
        List<SysUser> sysUsers = sysUserMapper.selectAll();
        System.err.println("没有使用缓存2");
        return id+"";
    }
}
