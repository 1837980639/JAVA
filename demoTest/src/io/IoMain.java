package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class IoMain {
    public static void main(String[] args) {
        try {
            testBufferInputStream();
            testBufferOutStream();
            copyFile();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    //缓冲字节输入流
    public static void testBufferInputStream() throws Exception{
        // 文件字节输入流对象
        FileInputStream in = new FileInputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test.txt");

        //缓冲字节输入流
        BufferedInputStream br = new BufferedInputStream(in);
        byte[] b = new byte[10];
        int len = 0;
        while ((len = br.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        //关闭流的时候，最晚开的时候最早关，依次关
        br.close();
        in.close();

    }
    //缓冲字节输出流
    public static void testBufferOutStream() throws Exception{
        // 创建字节输出对象
        FileOutputStream out = new FileOutputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test2.txt");

        //把字节输出流对象放入缓冲字节输出流中
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);

        String s = "hello world";

        bufferedOutputStream.write(s.getBytes());// 写入内存

        bufferedOutputStream.flush();// 刷入硬盘

        //关闭流
        bufferedOutputStream.close();
        out.close();
    }
    // 缓冲字节复制
    public static void copyFile() throws Exception{
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test.txt"));
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\copy.txt"));

        byte[] b = new byte[1024];

        int len = 0;
        while ((len = bufferedInputStream.read(b)) != -1){
            bufferedOutputStream.write(b,0,len);
        }

        bufferedOutputStream.flush();

        bufferedOutputStream.close();
        bufferedInputStream.close();
    }
}
