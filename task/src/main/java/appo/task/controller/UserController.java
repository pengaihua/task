package appo.task.controller;

import java.util.List;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RestController;

import appo.task.domain.UserEntity;
import appo.task.mapper.UserMapper; 




 @RestController 
 public class UserController { 
	 @Autowired
	 private JavaMailSender mailSender;
	 
 	@Autowired 
 	private UserMapper userMapper; 
 	 
 	@RequestMapping("/getUsers") 
 	public List<UserEntity> getUsers() { 
 		List<UserEntity> users=userMapper.getAll(); 
 		
 		try {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("ahpeng@appotronics.cn");
        message.setTo("ahpeng@appotronics.cn");
        message.setSubject("主题：简单邮件");
        message.setText("<html><h1>这是一个测试邮件</h1><table><tr><td>1234</td><td>23432</td></tr></table></html>");

        mailSender.send(message); }
 		catch(Exception ex)
 		{
 			ex.printStackTrace();
 		}
 		sendHtml();
 		System.out.println("send mail");
 		
 		return users; 
 	} 
 	 
     @RequestMapping("/getUser") 
     public UserEntity getUser(Long id) { 
     	UserEntity user=userMapper.getOne(id); 
         return user; 
     } 
      
     @RequestMapping("/add") 
     public void save(UserEntity user) { 
     	userMapper.insert(user); 
     } 
      
     @RequestMapping(value="update") 
     public void update(UserEntity user) { 
     	userMapper.update(user); 
     } 
      
     @RequestMapping(value="/delete/{id}") 
     public void delete(@PathVariable("id") Long id) { 
     	userMapper.delete(id); 
     } 
      
     private void  sendHtml() {
    	    MimeMessage message = null;
    	    try {
    	        message = mailSender.createMimeMessage();
    	        MimeMessageHelper helper = new MimeMessageHelper(message, true);
    	        helper.setFrom("ahpeng@appotronics.cn");
    	        helper.setTo("ahpeng@appotronics.cn");
    	        helper.setSubject("标题：发送Html内容");

    	        StringBuffer sb = new StringBuffer();
    	        sb.append("<h1>大标题-h1</h1>")
    	          .append("<p style='color:#F00'>红色字</p>")
    	          .append("<p style='text-align:right'>右对齐</p>");
    	        helper.setText(sb.toString(), true);
    	    } catch (MessagingException e) {
    	        e.printStackTrace();
    	    }

    	    mailSender.send(message);
     }
      
 } 
