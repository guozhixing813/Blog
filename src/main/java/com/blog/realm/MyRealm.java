package com.blog.realm;

import javax.annotation.Resource;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

import com.blog.entity.Blogger;
import com.blog.service.BloggerService;

public class MyRealm extends AuthorizingRealm {
	@Resource
	private BloggerService bloggerService;
	
	/**
	 * 获取授权信息
	 */
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
		return null;
	}

	/** 
	  *  登录验证 
	 * token:令牌,基于用户名和密码的令牌
	 */
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		// 从令牌中取出用户名
		String userName = (String) token.getPrincipal();
		// 让Shiro去验证账号密码
		Blogger blogger = bloggerService.getByUserName(userName);
		if(blogger != null) {
			SecurityUtils.getSubject().getSession().setAttribute("currentUser", blogger);
			AuthenticationInfo auInfo = new SimpleAuthenticationInfo();
			return auInfo;

		}
		
		return null;
	}
}
