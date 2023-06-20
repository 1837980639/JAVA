package webservice.tempuri.juzhuzheng.org.tempuri;


import webservice.tempuri.Authentication;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.MalformedURLException;
import java.net.URL;

public class Client {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("http://hjpt.fjzwt.cn:9000/hjservice/Authentication?wsdl");
        // 指定命名空间和服务名称
        QName qName = new QName("http://tempuri.org/", "Authentication");
        Service service = Service.create(url, qName);
        // 通过getPort方法返回指定接口
        Authentication myServer = service.getPort(new QName("http://tempuri.org/", "AuthenticationImplPort"), Authentication.class);
        // 调用方法 获取返回值
        String result = myServer.loginByAccount("ptzhd_hjjkdy", "zhd@0907");
//        String guid=result;
//        jsonobj = new JSONObject();

//        System.out.println(result);//18aa78f5-45d6-4170-9a80-5c6ef7d55cc9

        URL url1 = new URL("http://hjpt.fjzwt.cn:9000/hjservice/ResidenceInfo?wsdl");
        // 指定命名空间和服务名称
        QName qName1 = new QName("http://tempuri.org/", "ResidenceInfo");
        Service service1 = Service.create(url1, qName1);
        // 通过getPort方法返回指定接口
        ResidenceInfo myServer1 = service1.getPort(new QName("http://tempuri.org/",
                "ResidenceInfoImplPort"), ResidenceInfo.class);
        // 调用方法 获取返回值
        String result1 = myServer1.queryByID("fa19a0cb-6264-41ac-9a6a-d6228712cc91", "350128199205081733");
        System.out.println(result1);
        //18aa78f5-45d6-4170-9a80-5c6ef7d55cc9
    }
}
