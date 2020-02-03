package com.lzf.tfirst.sys_permission.mapper;

import com.lzf.tfirst.sys_permission.entity.SysPermission;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
public interface SysPermissionMapper extends BaseMapper<SysPermission> {
    List<String> selectPermissionByUserId(@Param(value = "id") Long id);

}
