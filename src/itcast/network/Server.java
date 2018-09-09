package itcast.network;

import java.io.*;
import java.net.*;

public class Server {

	public static void main(String[] args) {
        BufferedReader br=null;
        PrintWriter pw=null;
        try{ 
        	ServerSocket server=new ServerSocket(2000);
        	Socket socket=server.accept();
        	//获取输入流
        	br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
        	//获取输出流
        	pw=new PrintWriter(socket.getOutputStream(),true);
        	String s=br.readLine();//获取接收的数据
        	pw.println(s);         //发送相同的数据给客户端
        }catch(Exception e)
        {
        	e.printStackTrace();
        }
        finally {
			try {
				br.close();
				pw.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
