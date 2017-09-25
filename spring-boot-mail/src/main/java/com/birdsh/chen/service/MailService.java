package com.birdsh.chen.service;

import java.io.File;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

@Service
public class MailService {
	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private JavaMailSender mailSender;

	// 发送者
	@Value("${spring.mail.username}")
	private String from;

	/**
	 * 发送纯文本的简单邮件
	 * @param to 收件人
	 * @param subject 郵件主題
	 * @param content 郵件內容
	 */
	public String sendSimpleMail(String to, String subject, String content) {

		SimpleMailMessage message = new SimpleMailMessage(); 
		message.setFrom(from);
		message.setTo(to);
		message.setSubject(subject);
		message.setText(content);
		try {
			mailSender.send(message);
			logger.info("简单邮件已经发送。");
			
		} catch (Exception e) {
			logger.error("发送简单邮件时发生异常！", e); 
		}
		
		return "简单邮件已经发送成功！";
	}
	
	/** 
     * 发送html格式的邮件 
     * @param to 收件人
	 * @param subject 郵件主題
	 * @param content 郵件內容
     */  
    public void sendHtmlMail(String to, String subject, String content){  
        MimeMessage message = mailSender.createMimeMessage();  
  
        try {  
            //true表示需要创建一个multipart message  
            MimeMessageHelper helper = new MimeMessageHelper(message, true);  
            helper.setFrom(from);  
            helper.setTo(to);  
            helper.setSubject(subject);  
            helper.setText(content, true);  
  
            mailSender.send(message);  
            logger.info("html邮件已经发送。");  
        } catch (MessagingException e) {  
            logger.error("发送html邮件时发生异常！", e);  
        }  
    } 
    
    /** 
     * 发送带附件的邮件 
     * @param to 
     * @param subject 
     * @param content 
     * @param filePath 
     */  
    public void sendAttachmentsMail(String to, String subject, String content, String filePath){  
        MimeMessage message = mailSender.createMimeMessage();  
  
        try {  
            //true表示需要创建一个multipart message  
            MimeMessageHelper helper = new MimeMessageHelper(message, true);  
            helper.setFrom(from);  
            helper.setTo(to);  
            helper.setSubject(subject);  
            helper.setText(content, true);  
  
            FileSystemResource file = new FileSystemResource(new File(filePath));  
            String fileName = filePath.substring(filePath.lastIndexOf(File.separator));  
            helper.addAttachment(fileName, file);  
              
            mailSender.send(message);  
            logger.info("带附件的邮件已经发送。");  
        } catch (MessagingException e) {  
            logger.error("发送带附件的邮件时发生异常！", e);  
        }  
    }  
    
    /** 
     * 发送嵌入静态资源（一般是图片）的邮件 
     * @param to 
     * @param subject 
     * @param content 邮件内容，需要包括一个静态资源的id，比如：<img src=\"cid:rscId01\" > 
     * @param rscPath 静态资源路径和文件名 
     * @param rscId 静态资源id 
     */  
    public void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId){  
        MimeMessage message = mailSender.createMimeMessage();  
  
        try {  
            //true表示需要创建一个multipart message  
            MimeMessageHelper helper = new MimeMessageHelper(message, true);  
            helper.setFrom(from);  
            helper.setTo(to);  
            helper.setSubject(subject);  
            helper.setText(content, true);  
  
            FileSystemResource res = new FileSystemResource(new File(rscPath));  
            helper.addInline(rscId, res);  
              
            mailSender.send(message);  
            logger.info("嵌入静态资源的邮件已经发送。");  
        } catch (MessagingException e) {  
            logger.error("发送嵌入静态资源的邮件时发生异常！", e);  
        }  
    }  

}
