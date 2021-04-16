package com.yidu.code.controller;

import com.yidu.code.entiry.ImageVerificationCode;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author XiongAiWen
 * @version 1.0
 * @description:
 * @data 2021/4/8 14:39
 */
@Controller
public class TestController {
    @RequestMapping("getVerifiCode")
    @ResponseBody
    public void getVerifiCode(HttpServletRequest request, HttpServletResponse response) throws IOException {
         /*
         1.生成验证码
         2.把验证码上的文本存在session中
         3.把验证码图片发送给客户端
         */
        ImageVerificationCode ivc = new ImageVerificationCode();     //用我们的验证码类，生成验证码类对象
        BufferedImage image = ivc.getImage();  //获取验证码
        request.getSession().setAttribute("text", ivc.getText()); //将验证码的文本存在session中
        System.out.println("text = " + ivc.getText());
        ivc.output(image, response.getOutputStream());//将验证码图片响应给客户端
    }


    @RequestMapping("Login_authentication")
    @ResponseBody
    public String Login_authentication(HttpServletRequest request,HttpServletResponse response,String verificationCode) throws IOException, ServletException {
        request.setCharacterEncoding("utf-8");
        String session_vcode=(String) request.getSession().getAttribute("text");    //从session中获取真正的验证码
        if(session_vcode.equalsIgnoreCase(verificationCode)){
            return "true";
        }
        return "false";
    }

    @RequestMapping("checkCode")
    @ResponseBody
    public String checkCode(){

        return "";
    }

}
