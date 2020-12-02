import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;

/**
 * @author ：sunyucui
 * @date ：Created in 2020/12/1 20:38
 * @description：demo
 * @modified By：
 * @version:
 */
public class demo {
    public static void main(String[] args) throws IOException {
        /*//1.	准备一个URL对象：url
        URL url = new URL("https://www.baidu.com/");
        //2.	通过网址url打开服务器连接，并得到连接对象conn
        URLConnection conn = url.openConnection();
        //3.	得到用于读取页面资源的字节输入流
        InputStream is = conn.getInputStream();
        //4.	将is，装饰为能一次读取一行的字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        //5.	读取一行资源
        String text = br.readLine();
        //6.	显示
        System.out.println(text);

        //5.	读取一行资源
        String text2 = br.readLine();
        //6.	显示
        System.out.println(text2);
        //5.	读取一行资源
        String text3 = br.readLine();
        //6.	显示
        System.out.println(text3);
        //5.	读取一行资源
        String text4 = br.readLine();
        //6.	显示
        System.out.println(text4);
        //5.	读取一行资源
        String text5 = br.readLine();
        //6.	显示
        System.out.println(text5);
        //5.	读取一行资源
        String text6 = br.readLine();
        //6.	显示
        System.out.println(text6);
        //7.	关闭连接
        br.close();*/
       /* *//*智能机器人aip*//*
        String content = URLEncoder.encode("给大爷讲个段子","UTF-8");
        //1.	准备一个URL对象：url
        URL url = new URL("https://api.jisuapi.com/iqa/query?appkey=62958a3a6ef3c56d&question="+content);
        //2.	通过网址url打开服务器连接，并得到连接对象conn
        URLConnection conn = url.openConnection();
        //3.	得到用于读取页面资源的字节输入流
        InputStream is = conn.getInputStream();
        //4.	将is，装饰为能一次读取一行的字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        //5.	读取一行资源
        String text = br.readLine();
        //6.	显示
        System.out.println(text);
        //7.	关闭连接
        br.close();*/
        //1.	准备一个URL对象：url
        URL url = new URL("https://itdage.com/kkb/kkbsms?key=xzk&number=17861502771&code=102411");
        //2.	通过网址url打开服务器连接，并得到连接对象conn
        URLConnection conn = url.openConnection();
        //3.	得到用于读取页面资源的字节输入流
        InputStream is = conn.getInputStream();
        //4.	将is，装饰为能一次读取一行的字符缓冲输入流
        BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
        //5.	读取一行资源
        String text = br.readLine();
        //6.	显示
        System.out.println(text);
        //7.	关闭连接
        br.close();
    }
}
