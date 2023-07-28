package io;

import java.io.*;

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

        //文件字符输入流（未使用，效果一样）
        FileReader Fr = new FileReader("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test.txt");

        //转换流（字节转字符） 输入流
        InputStreamReader fs = new InputStreamReader(in,"GBK");

        //接收键盘的输入流（标准输入流）
        InputStreamReader jp = new InputStreamReader(System.in);

        //缓冲字节输入流
        BufferedInputStream br = new BufferedInputStream(in);
        byte[] b = new byte[10];
        int len = 0;
        while ((len = br.read(b)) != -1){
            System.out.println(new String(b,0,len));
        }
        //关闭流的时候，最晚开的时候最早关，依次关
        br.close();
        jp.close();
        fs.close();
        Fr.close();
        in.close();

    }
    //缓冲字节输出流
    public static void testBufferOutStream() throws Exception{
        // 创建字节输出对象
        FileOutputStream out = new FileOutputStream("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test2.txt");

        //文件字符输出流（未使用，效果一样）
        FileWriter Fw = new FileWriter("D:\\AHomeWrok\\JAVA\\demoTest\\src\\io\\test2.txt");

        //转换流 字节转字符输出流
        OutputStreamWriter fS = new OutputStreamWriter(out,"GBK");

        //把字节输出流对象放入缓冲字节输出流中
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(out);

        String s = "hello world";

        bufferedOutputStream.write(s.getBytes());// 写入内存

        bufferedOutputStream.flush();// 刷入硬盘

        //关闭流
        bufferedOutputStream.close();
        fS.close();
        Fw.close();
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
