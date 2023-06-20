package webservice.tempuri;

import cn.hutool.json.JSONObject;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class WsClient1 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://hjpt.fjzwt.cn:9000/hjservice/Authentication?wsdl");
        // 指定命名空间和服务名称
        QName qName = new QName("http://tempuri.org/", "Authentication");
        Service service = Service.create(url, qName);
        // 通过getPort方法返回指定接口
        Authentication myServer = service.getPort(new QName("http://tempuri.org/", "AuthenticationImplPort"), Authentication.class);
        // 调用方法 获取返回值
        String result = myServer.loginByAccount("ptzhd_hjjkdy", "zhd@0907");
//        转化为json对象
        JSONObject jsonObject = new JSONObject(result);
//        输出data值
        System.out.println(jsonObject.get("data"));//18aa78f5-45d6-4170-9a80-5c6ef7d55cc9
    }
}
