package com.ynding.socket.chatting;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class RecieveThread extends Thread{

	private Socket socket;
	
	public RecieveThread(Socket socket){
		this.socket = socket;
	}
	
	public void run(){
		try {
			InputStream is = socket.getInputStream();
			DataInputStream dis = new DataInputStream(is);
			
			while(true){
				String msg = dis.readUTF();
				System.out.println(msg);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
