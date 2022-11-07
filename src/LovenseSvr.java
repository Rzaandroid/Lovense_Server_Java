import java.io.*;  
import java.net.*;
import java.lang.*; 
import java.io.DataInputStream;

 public class LovenseSvr
{
	InputStream in;
	DataInputStream dis;
	String read;
	ServerSocket serverSocket;
	Socket sock;

   	public LovenseSvr() throws Exception
	{
		startSvr();
		
		while(true)
		{
			read = dis.readUTF();
			System.out.println(read);
			
			if(read.startsWith("rsi"))
			{
			}
			
			
			if(read.startsWith("close"))
			{
				dis.close();
				in.close();
				serverSocket.close();
				startSvr();
			}
			Thread.sleep(2);
		}
   	}
   	
   	public void startSvr() throws Exception
   	{
   		serverSocket = new ServerSocket(8888);
      sock = serverSocket.accept();
		in = sock.getInputStream();
		dis = new DataInputStream(in);
	}
   	
   	public static void main(String args[]) throws Exception
   	{
   		LovenseSvr svr = new LovenseSvr();
   	}
 }
