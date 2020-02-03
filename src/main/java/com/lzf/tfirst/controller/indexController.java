package com.lzf.tfirst.controller;

import com.baomidou.mybatisplus.core.toolkit.IdWorker;
import com.lzf.tfirst.config.BaseController;
import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_user.service.impl.SysUserServiceImpl;
import com.lzf.tfirst.sys_users.entity.SysUsers;
import com.lzf.tfirst.sys_users.mapper.SysUsersMapper;
import com.lzf.tfirst.sys_users.service.impl.SysUsersServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;
import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
@RequestMapping("/")
public class indexController extends BaseController {
    @Resource
    SysUserServiceImpl sysUserService;
    @Resource
    SysUsersServiceImpl sysUsersService;
    @Resource
    SysUsersMapper sysUsersMapper;
    @Resource
    CacheManager cacheManager;

    @RequestMapping("/home")
    @RequiresPermissions("ssss")
    public String index(Model model, HttpServletRequest request) {
        SysUser sysUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
        model.addAttribute("userName", sysUser.getFullName());
        /*Subject subject = SecurityUtils.getSubject();
        boolean menu = subject.hasRole("ssss");
        System.out.println(menu);*/
        return "/index.html";
    }

   /* @RequestMapping("/")
    public String login(Model model){
        model.addAttribute("message","");
        return "/login.html";
    }*/
    @RequestMapping("/")
    public String login(Model model){
        List<SysUsers> hussar = sysUsersMapper.selectAll("hussar");
        /*String id = sysUsersService.getId(1);
        String id2 = sysUsersService.getId(1);
        String id21 = sysUsersService.getId2(1);
        String id22 = sysUsersService.getId2(1);*/
        return "/home";
    }


    @RequestMapping("/code")
    @ResponseBody
    public String code(String m,String t){
        if(m == "" || m == null || t == "" || t == null){
            //CodeGenerator.code("lxs_contract","lxs_contract");
            return "请输入正确的参数!";
        }else {
            CodeGenerator.code(m,t);
        }
        return "生成【"+ m +"】成功";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "hello";
    }


}
