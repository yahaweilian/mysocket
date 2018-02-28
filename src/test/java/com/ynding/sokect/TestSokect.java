package com.ynding.sokect;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.InetAddress;

public class TestSokect {

	public static void main(String[] args) throws IOException {
		InetAddress host = InetAddress.getLocalHost();
		String ip = host.getHostAddress();
		System.out.println("本机ip地址： "+ ip);
		
		Process p = Runtime.getRuntime().exec("ping " + ip);
		BufferedReader br = new BufferedReader(new InputStreamReader(p.getInputStream()));
		String line = null;
		StringBuilder sb = new StringBuilder();
		while((line = br.readLine()) != null) {
			if(line.length() != 0){
				sb.append(new String(line.getBytes(), "UTF-8") + "\r\n");
			}
		}
		System.out.println("本指令返回的消息是：");
		System.out.println(sb.toString());
		
 	}
}
