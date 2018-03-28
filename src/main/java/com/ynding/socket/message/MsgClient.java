package com.ynding.socket.message;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 收发字符串客户端
 * @author Administrator
 *
 */
public class MsgClient {
	 public static void main(String[] args) {
		 
	        try {
	            Socket s = new Socket("127.0.0.1", 8888);
	 
	            OutputStream os = s.getOutputStream();
	 
	            //把输出流封装在DataOutputStream中
	            DataOutputStream dos = new DataOutputStream(os);
	            //使用writeUTF发送字符串
	            dos.writeUTF("Legendary!");
	            dos.close();
	            s.close();
	        } catch (UnknownHostException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	    }
}
