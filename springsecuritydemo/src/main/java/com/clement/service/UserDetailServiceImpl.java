package com.clement.service;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName: UserDetailServiceImpl
 * @Author: Clement
 * @Date: 2019/9/4 1:04
 * @Version: 1.0
 * @Description:
 */
public class UserDetailServiceImpl implements UserDetailsService {
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       //校验用户是否VIP
        //校验相关操作
        //校验IP  等等


        //模拟数据
        String password = "e10adc3949ba59abbe56e057f20f883e";

        List<GrantedAuthority> grantedList = new ArrayList<>();
        //这里要给用户授权对应的角色
        grantedList.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        grantedList.add(new SimpleGrantedAuthority("USER"));

        //校验通过后放行
        User user = new User(username, password, grantedList);
        return user;
    }
}
