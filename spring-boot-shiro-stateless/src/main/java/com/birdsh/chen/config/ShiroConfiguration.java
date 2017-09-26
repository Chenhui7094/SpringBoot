package com.birdsh.chen.config;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.shiro.mgt.DefaultSessionStorageEvaluator;
import org.apache.shiro.mgt.DefaultSubjectDAO;
import org.apache.shiro.mgt.SecurityManager;
import org.apache.shiro.session.mgt.DefaultSessionManager;
import org.apache.shiro.spring.security.interceptor.AuthorizationAttributeSourceAdvisor;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;
import org.springframework.aop.framework.autoproxy.DefaultAdvisorAutoProxyCreator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * shiro配置类.
 * 
 * @author chenhui
 */
@Configuration
public class ShiroConfiguration {
	// 第一：ShiroFilterFactory：Shiro过滤器工厂类，具体的实现类是：ShiroFilterFactoryBean，此实现类是依赖于SecurityManager安全管理器的。
	/**
	 * 注入shiro的filterFactoryBean对象
	 * 
	 * @param securityManager
	 * @return
	 */
	@Bean
	public ShiroFilterFactoryBean shiroFilter(SecurityManager securityManager) {

		ShiroFilterFactoryBean factoryBean = new ShiroFilterFactoryBean();

		factoryBean.setSecurityManager(securityManager);
		// Add.4.2.start

		factoryBean.getFilters().put("statelessAuthc", statelessAuthcFilter());

		// 拦截器.

		Map<String, String> filterChainDefinitionMap = new LinkedHashMap<String, String>();

		filterChainDefinitionMap.put("/**", "statelessAuthc");

		factoryBean.setFilterChainDefinitionMap(filterChainDefinitionMap);

		// Add.4.2.end

		return factoryBean;

	}

	// 第二：SecurityManager：Shiro的安全管理器，主要是身份认证的管理，缓存管理，Cookie管理，所以在实际开发中主要是和SecurityManager进行打交道的，ShiroFilterFacotory只要配置好Filter就可以了。
	/**
	 * shiro安全管理器:注入shiro的securityManager对象 主要是身份认证的管理，缓存管理，cookie管理，
	 * 所以在实际开发中我们主要是和SecurityManager进行打交道的
	 * 
	 * @return
	 */
	@Bean
	public DefaultWebSecurityManager securityManager() {

		DefaultWebSecurityManager securityManager = new DefaultWebSecurityManager();
		// 其次就是将StatelessDefaultSubjectFactory交给DefaultWebSecurityManager进行管理
		// Add.2.2
		securityManager.setSubjectFactory(subjectFactory());
		// Add.2.5
		securityManager.setSessionManager(sessionManager());
		// Add.4.4

		securityManager.setRealm(statelessRealm());

		/*
		 * 禁用使用Sessions 作为存储策略的实现，但它没有完全地禁用Sessions
		 * 所以需要配合context.setSessionCreationEnabled(false);
		 */
		// 最后使用securityManager获取到subjectDao禁用session的存储策略
		// Add.2.3
		((DefaultSessionStorageEvaluator) ((DefaultSubjectDAO) securityManager.getSubjectDAO())
				.getSessionStorageEvaluator()).setSessionStorageEnabled(false);

		return securityManager;
	}

	/**
	 * Add.2.1 subject工厂管理器.首先要注入StatelessDefaultSubjectFactory
	 * 
	 * @return
	 */
	@Bean
	public DefaultWebSubjectFactory subjectFactory() {
		StatelessDefaultSubjectFactory subjectFactory = new StatelessDefaultSubjectFactory();
		return subjectFactory;
	}

	/**
	 * Add.2.4 session管理器：
	 * sessionManager通过sessionValidationSchedulerEnabled禁用掉会话调度器，
	 * 因为我们禁用掉了会话，所以没必要再定期过期会话了。
	 * 
	 * @return
	 */
	@Bean
	public DefaultSessionManager sessionManager() {
		DefaultSessionManager sessionManager = new DefaultSessionManager();
		sessionManager.setSessionValidationSchedulerEnabled(false);
		return sessionManager;
	}

	/**
	 * 
	 * Add.4.3
	 * 
	 * 自己定义的realm.
	 * 
	 * @return
	 * 
	 */

	@Bean

	public StatelessAuthorizingRealm statelessRealm() {

		StatelessAuthorizingRealm realm = new StatelessAuthorizingRealm();

		return realm;

	}

	/**
	 * 
	 * Add.4.1
	 * 
	 * 访问控制器.
	 * 
	 * @return
	 * 
	 */

	@Bean

	public StatelessAccessControlFilter statelessAuthcFilter() {

		StatelessAccessControlFilter statelessAuthcFilter = new StatelessAccessControlFilter();

		return statelessAuthcFilter;

	}

	/**
	 * 
	 * Add.5.1
	 * 
	 * 开启shiro aop注解支持.
	 * 
	 * 使用代理方式;所以需要开启代码支持;
	 * 
	 * @param securityManager
	 * 
	 * @return
	 * 
	 */

	@Bean

	public AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor(SecurityManager securityManager) {

		AuthorizationAttributeSourceAdvisor authorizationAttributeSourceAdvisor = new AuthorizationAttributeSourceAdvisor();

		authorizationAttributeSourceAdvisor.setSecurityManager(securityManager);

		return authorizationAttributeSourceAdvisor;

	}

	/**

     * Add.5.2

     *   自动代理所有的advisor:

     *   由Advisor决定对哪些类的方法进行AOP代理。

     */

    @Bean

    public DefaultAdvisorAutoProxyCreator getDefaultAdvisorAutoProxyCreator() {

       DefaultAdvisorAutoProxyCreator daap = new DefaultAdvisorAutoProxyCreator();

       daap.setProxyTargetClass(true);

       return daap;

   }

}
