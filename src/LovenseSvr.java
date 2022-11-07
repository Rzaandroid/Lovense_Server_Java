import java.io.*;
import java.net.*;
import java.lang.*;
import java.io.DataInputStream;

 public class LovenseSvr
{
	InputStream in;
	OutputStream out;
	DataInputStream dis;
	DataOutputStream dos;
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
			dos.write(dis.read());

			Thread.sleep(2);
		}
   	}
   	
   	public void startSvr() throws Exception
   	{
   		serverSocket = new ServerSocket(8888);
      	sock = serverSocket.accept();
		in = sock.getInputStream();
		dis = new DataInputStream(in);
		out = sock.getOutputStream();
		dos = new DataOutputStream(out);
	}
   	
   	public static void main(String args[]) throws Exception
   	{
   		LovenseSvr svr = new LovenseSvr();
   	}
 }
