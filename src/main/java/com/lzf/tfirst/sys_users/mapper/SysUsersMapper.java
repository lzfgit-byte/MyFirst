package com.lzf.tfirst.sys_users.mapper;

import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_users.entity.SysUsers;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * <p>
 * 用户表 Mapper 接口
 * </p>
 *
 * @author lzf
 * @since 2019-12-05
 */
public interface SysUsersMapper extends BaseMapper<SysUsers> {
    @Select("select * from sys_users where user_id = #{id}")
    List<SysUsers> selectAll(@Param(value = "id") String id);
    @Select({"<script>","select * from sys_users",
            "where 1=1",
            "<where test='id != null'>",
            "and user_id = #{id}",
            "</when>","<script>"})
    List<SysUsers> selectOne(@Param(value = "id") String id);
}
