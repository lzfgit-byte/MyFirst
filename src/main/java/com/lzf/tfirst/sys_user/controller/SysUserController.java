package com.lzf.tfirst.sys_user.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_user.mapper.SysUserMapper;
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
 * @since 2019-12-02
 */
@RestController
@RequestMapping("/sys_user")
public class SysUserController extends BaseController {
    @Resource
    SysUserMapper sysUserMapper;


    @RequestMapping("")
    @ResponseBody
    public String index(){
        QueryWrapper<SysUser> qw = new QueryWrapper<>();
        List<SysUser> sysUsers = sysUserMapper.selectList(qw);

        return "1";
    }



}
