package com.ynding.socket.chatting;

import java.io.IOException;
import java.net.Socket;

/**
 * 多线程聊天客户端
 * @author Administrator
 *
 */
public class ChatClient {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			// 启动发送消息线程
            new SendThread(socket).start();
            // 启动接受消息线程
            new RecieveThread(socket).start();
            
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
