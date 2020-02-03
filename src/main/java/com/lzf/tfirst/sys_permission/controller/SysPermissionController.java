package com.lzf.tfirst.sys_permission.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzf.tfirst.sys_permission.entity.SysPermission;
import com.lzf.tfirst.sys_permission.mapper.SysPermissionMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lzf.tfirst.config.BaseController;

import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author lzf
 * @since 2019-11-22
 */
@RestController
@RequestMapping("/sys_permission")
public class SysPermissionController extends BaseController {
    @Resource
    SysPermissionMapper sysPermissionMapper;


    @RequestMapping("")
    @ResponseBody
    public String index(){
        QueryWrapper<SysPermission> qw = new QueryWrapper<>();
        List<SysPermission> sysPermissions = sysPermissionMapper.selectList(qw);

        return "1";
    }



}
