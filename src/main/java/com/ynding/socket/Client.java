package com.ynding.socket;

import java.io.IOException;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {
		try {
			Socket socket = new Socket("127.0.0.1", 8888);
			System.out.println(socket);
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
