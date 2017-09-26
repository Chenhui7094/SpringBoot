package com.birdsh.chen.config;

import java.util.Map;

import org.apache.shiro.authc.AuthenticationToken;

/**
 * 用于授权的Token对象：
 * 用户身份即用户名；
 * 凭证即客户端传入的消息摘要。
 * @date 2017年9月25日
 */
public class StatelessAuthenticationToken implements AuthenticationToken {
	
	private static final long serialVersionUID = 1L;
	
	private String username;//用户身份即用户名；

    private Map<String,?> params;//参数.

    private String clientDigest;//凭证即客户端传入的消息摘要。
    
    public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Map<String, ?> getParams() {
		return params;
	}
	public void setParams(Map<String, ?> params) {
		this.params = params;
	}
	public String getClientDigest() {
		return clientDigest;
	}
	public void setClientDigest(String clientDigest) {
		this.clientDigest = clientDigest;
	}
	//无参的构造方法
    public StatelessAuthenticationToken() {

    }
    //有参的构造方法
    public StatelessAuthenticationToken(String username, Map<String, ?> params, String clientDigest){
    	 super();
         this.username = username;
         this.params = params;
         this.clientDigest = clientDigest;
    }
    //有参的构造方法
    public StatelessAuthenticationToken(String username, String clientDigest) {
        super();
        this.username = username;
        this.clientDigest = clientDigest;
     }
    
	@Override
	public Object getCredentials() {
		// TODO Auto-generated method stub
		return clientDigest;
	}

	@Override
	public Object getPrincipal() {
		// TODO Auto-generated method stub
		return username;
	}

}
