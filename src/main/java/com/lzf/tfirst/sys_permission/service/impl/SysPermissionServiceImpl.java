package com.lzf.tfirst.sys_permission.service.impl;

import com.lzf.tfirst.sys_permission.entity.SysPermission;
import com.lzf.tfirst.sys_permission.mapper.SysPermissionMapper;
import com.lzf.tfirst.sys_permission.service.ISysPermissionService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
@Service
public class SysPermissionServiceImpl extends ServiceImpl<SysPermissionMapper, SysPermission> implements ISysPermissionService {
    @Resource
    SysPermissionMapper sysPermissionMapper;

    @Cacheable(cacheNames = "permission",key = "#p0")
    @Override
    public List<String> selectPermissionByUserId(Long id) {
        return sysPermissionMapper.selectPermissionByUserId(id);
    }
}
