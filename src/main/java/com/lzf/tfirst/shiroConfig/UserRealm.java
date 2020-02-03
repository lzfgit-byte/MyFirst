package com.lzf.tfirst.shiroConfig;

import com.lzf.tfirst.sys_permission.service.ISysPermissionService;
import com.lzf.tfirst.sys_user.entity.SysUser;
import com.lzf.tfirst.sys_user.service.ISysUserService;
import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Set;

/**
 * @Description
 * @Author sgl
 * @Date 2018-06-11 17:07
 */
public class UserRealm extends AuthorizingRealm {
    private static final Logger LOGGER = LoggerFactory.getLogger(UserRealm.class);
    @Autowired
    private ISysUserService sysUserService;

    @Autowired
    private ISysPermissionService sysPermissionService;

    /**
     * 授权  用于获取认证成功后的角色、权限等信息
     *
     * @param principals
     * @return
     */
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        SysUser sysUser = (SysUser) principals.getPrimaryPrincipal();
        List<String> sysPermissions = sysPermissionService.selectPermissionByUserId(sysUser.getUserId());

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(sysPermissions);
        info.addStringPermission("ssss");
        info.addRole("ssss");
        LOGGER.info("doGetAuthorizationInfo");
        return info;
    }


    /**
     * 认证 验证当前登录的Subject
     *
     * @param authenticationToken
     * @return
     * @throws AuthenticationException
     */
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
       /* String username = (String) authenticationToken.getPrincipal();
        if (!"admin".equals(username)) {
            throw new UnknownAccountException("账户不存在!");
        }
        return new SimpleAuthenticationInfo(username, "123456", getName());*/

        UsernamePasswordToken token = (UsernamePasswordToken) authenticationToken;
        char[] password = token.getPassword();
        SysUser sysUser = sysUserService.findByUserName(token.getUsername());
        if (sysUser == null) {
            return null;
        }
        LOGGER.info("doGetAuthenticationInfo");
        return new SimpleAuthenticationInfo(sysUser, sysUser.getPassword().toCharArray(),ByteSource.Util.bytes(sysUser.getSalt()), getName());
    }
}


