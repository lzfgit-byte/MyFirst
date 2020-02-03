package com.lzf.tfirst.util;

import com.lzf.tfirst.sys_user.entity.SysUser;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.ByteSource;

public class ShrioUtil {
    public static String getPas(String pass,String salt){
        /*	//md5加密 无盐加密
		String hashAlgorithmName = "MD5";
        String credentials = "admin";
        int hashIterations = 1024;
        Object obj = new SimpleHash(hashAlgorithmName, credentials, null, hashIterations);
        System.out.println(obj);*/

        String hashAlgorithmName = "MD5";//散列算法类型为MD5
        String credentials = pass;
        int hashIterations = 1024;//hash的次数
        ByteSource credentialsSalt = ByteSource.Util.bytes(salt);
        Object obj = new SimpleHash(hashAlgorithmName, credentials, credentialsSalt, 1);

        return (String) obj;
    }

    public SysUser getUser(){
        Subject subject = SecurityUtils.getSubject();
        return (SysUser) subject.getPrincipal();
    }
}
