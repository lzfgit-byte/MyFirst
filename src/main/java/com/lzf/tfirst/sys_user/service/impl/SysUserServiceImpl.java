package com.lzf.tfirst.sys_user.service.impl;

import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_user.mapper.SysUserMapper;
import com.lzf.tfirst.sys_user.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.Cache;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author lzf
 * @since 2019-12-02
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {

    @Resource
    SysUserMapper sysUserMapper;

    @Override
    public SysUser findByUserName(String username) {
        return sysUserMapper.findByUserName(username);
    }

    @Override
    public List<SysUser> selectAll(int a) {
        //Cache users = cacheManager.getCache("users");

        return sysUserMapper.selectAll();
    }

}
