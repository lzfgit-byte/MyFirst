package com.lzf.tfirst.sys_user.mapper;

import com.lzf.tfirst.sys_user.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author lzf
 * @since 2019-12-02
 */
public interface SysUserMapper extends BaseMapper<SysUser> {

    SysUser findByUserName(@Param("username") String username);

    List<SysUser> selectAll();
}
