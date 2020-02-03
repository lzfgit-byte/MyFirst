package com.lzf.tfirst.sys_users.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzf.tfirst.sys_users.entity.SysUsers;
import com.lzf.tfirst.sys_users.mapper.SysUsersMapper;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.lzf.tfirst.config.BaseController;

import javax.annotation.Resource;
import java.util.List;
/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author lzf
 * @since 2019-12-05
 */
@RestController
@RequestMapping("/sys_users")
public class SysUsersController extends BaseController {
    @Resource
    SysUsersMapper sysUsersMapper;


    @RequestMapping("")
    @ResponseBody
    public String index(){
        QueryWrapper<SysUsers> qw = new QueryWrapper<>();
        List<SysUsers> sysUserss = sysUsersMapper.selectList(qw);

        return "1";
    }



}
