package com.yidu.code.controller;

/*import java.io.IOException;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;*/


/**
 * 短信验证码
 * @author MWH
 *
 */
public class SmsCodeTest {

    /*public static void main(String[] args) {
        // 获取连接
        HttpClient client = new HttpClient();
        // 短信验证码API接口地址
        PostMethod method = new PostMethod("https://vip.veesing.com/smsApi/verifyCode");
        // 设置编码
        client.getParams().setContentCharset("UTF-8");
        method.setRequestHeader("ContentType", "application/x-www-form-urlencoded;charset=utf-8");
        // 手机号码，一次只能提交一个手机号码
        String phone = "156xxxx1090";
        //模板ID(如没有模板ID请先在平台上新增并提交验证码模板，审核通过即可使用)
        String templateId = "540";
        // 验证码变量(随机数)
        Integer num = 1234;
        String variables = num.toString();
        System.out.println("验证码是："+variables);
        // 拼接参数
        NameValuePair[] data = {
                new NameValuePair("appId", "QKCT4CWPO4VA"),
                new NameValuePair("appKey", "WVNA4A0*****"),
                new NameValuePair("phone", phone),
                new NameValuePair("templateId", templateId),
                new NameValuePair("variables", variables) };
        method.setRequestBody(data);
        try {
            client.executeMethod(method);
            String result = method.getResponseBodyAsString();
            // 返回结果
            System.out.println(result);
            JSONObject jsonObject = JSONObject.parseObject(result);
            // 返回1则发送成功(逻辑操作请根据接口文档返回参数自行判断)
            if (jsonObject.get("returnStatus").equals("1")) {
                System.out.println("成功！");
            } else {
                System.out.println("失败！");
            }
            // 释放连接
            method.setRequestHeader("Connection", "close");
            method.releaseConnection();
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/
}