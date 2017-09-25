package com.birdsh.chen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.birdsh.chen.service.MailService;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;

@RestController
public class MailController {
	@Autowired
    private MailService mailService;
	
	@ApiOperation(value = "发送纯文本的简单邮件", notes = "发送纯文本的简单邮件")
	@ApiImplicitParams({
			@ApiImplicitParam(name = "to", value = "收件人", dataType = "String", paramType = "query", required = true),
			@ApiImplicitParam(name = "subject", value = "郵件主題", dataType = "String", paramType = "query", required = true),
			@ApiImplicitParam(name = "content", value = "郵件內容", dataType = "String", paramType = "query", required = true)})
	@PostMapping("/likeName")
	public String sendSimpleMail(String to, String subject, String content){
		return mailService.sendSimpleMail(to, subject, content);
	}
	

}
