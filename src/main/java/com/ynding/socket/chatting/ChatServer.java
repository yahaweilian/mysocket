package com.ynding.socket.chatting;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 多线程聊天服务端
 * @author Administrator
 *
 */
public class ChatServer {

	public static void main(String[] args) {
		try {
			 //服务端打开端口8888
			ServerSocket serverSocket = new ServerSocket(8888);
			 //在8888端口上监听，看是否有连接请求过来
			System.out.println("监听在端口号:8888");
			Socket socket = serverSocket.accept();

			 //启动发送消息线程
            new SendThread(socket).start();
            //启动接受消息线程
            new RecieveThread(socket).start();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
