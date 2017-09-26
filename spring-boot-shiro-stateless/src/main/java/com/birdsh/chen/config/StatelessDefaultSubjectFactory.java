package com.birdsh.chen.config;

import org.apache.shiro.subject.Subject;

import org.apache.shiro.subject.SubjectContext;

import org.apache.shiro.web.mgt.DefaultWebSubjectFactory;

/**
 * 通过调用context.setSessionCreationEnabled(false)表示不创建会话；如果之后调用
 * Subject.getSession()将抛出DisabledSessionException异常。
 * 
 * @author chenhui
 */

public class StatelessDefaultSubjectFactory extends DefaultWebSubjectFactory {
	@Override
	public Subject createSubject(SubjectContext context) {
		// 不创建session.
		context.setSessionCreationEnabled(false);
		System.out.println("shiro.config.subjectFactory.createSubject.SessionCreationEnabled.false");
		return super.createSubject(context);
	}
}