import java.io.IOException;
import java.net.ServerSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;
import java.util.*;


public class Lovense
{
static String text = "";

public static void lovenseQR()
{
	String url= "https://api.lovense.com/api/lan/getQrCode";
	Map<String, String> requestParameter = new HashMap<String, String>();
	//TODO initialize your parameters:
	requestParameter.put("token", "{Lovense developer token}");
	requestParameter.put("uid", "{user ID on your website}");
	requestParameter.put("uname", "{user nickname on your website}");
	requestParameter.put("utoken", "{encrypted user token on your application. This is a security consideration, to avoid others stealing control of the toy.}");
	//HttpPost httpPost = new HttpPost(url);
	//List<NameValuePair> nameValuePairs = new ArrayList<NameValuePair>();
	if (requestParameter != null && !requestParameter.isEmpty())
	{
  		Set<String> keys = requestParameter.keySet();
  		for (String key : keys)
  		{
    			//nameValuePairs.add(new BasicNameValuePair(key, requestParameter.get(key)));
  		}
	}
	//httpPost.setEntity(new UrlEncodedFormEntity(nameValuePairs, "utf-8"));
}

public static void main(String args[]) throws IOException
{
Lovense lov = new Lovense();
lov.lovenseQR();
int hits=24;
ServerSocket server = new ServerSocket(8080);
System.out.println("Listening for connection on port 8080 ....");
while (true)
{
Socket socket = server.accept();
InetAddress addr = socket.getInetAddress();
System.out.println(addr.getHostAddress().toString());
if(!(addr.getHostAddress().toString().equals("192.168.1.1")))
{
	hits++;
}
Date today = new Date();
	System.out.println(today);
	System.out.println("HIT COUNTER:"+hits);
      System.out.println("Connection made to " + addr.getHostName() + " (" + addr.getHostAddress()
          + ")");
//String httpResponse = ("HTTP/1.0 200 OK\r\n" + today
String httpResponse = ("HTTP/1.0 200 OK\r\n" +
                   "\r\n" +
                   "<!DOCTYPE html>"+
"<!--"+
" *  Copyright (c) 2015 The WebRTC project authors. All Rights Reserved."+
" *"+
" *  Use of this source code is governed by a BSD-style license"+
" *  that can be found in the LICENSE file in the root of the source"+
" *  tree."+
"-->"+
"<html>"+
"<head>"+

"    <meta charset=\"utf-8\">"+
"    <meta name=\"description\" content=\"WebRTC code samples\">"+
"    <meta name=\"viewport\" content=\"width=device-width, user-scalable=yes, initial-scale=1, maximum-scale=1\">"+
"    <meta itemprop=\"description\" content=\"Client-side WebRTC code samples\">"+
"    <meta itemprop=\"image\" content=\"../../../images/webrtc-icon-192x192.png\">"+
"    <meta itemprop=\"name\" content=\"WebRTC code samples\">"+
"    <meta name=\"mobile-web-app-capable\" content=\"yes\">"+
"    <meta id=\"theme-color\" name=\"theme-color\" content=\"#ffffff\">"+

"    <base target=\"_blank\">"+

"    <title>getUserMedia</title>"+

"    <link rel=\"icon\" sizes=\"192x192\" href=\"../../../images/webrtc-icon-192x192.png\">"+
"    <link href=\"//fonts.googleapis.com/css?family=Roboto:300,400,500,700\" rel=\"stylesheet\" type=\"text/css\">"+
"    <link rel=\"stylesheet\" href=\"../../../css/main.css\">"+

"</head>"+

"<body>"+

"<div id=\"container\">"+
"    <h1><a href=\"//webrtc.github.io/samples/\" title=\"WebRTC samples homepage\">WebRTC samples</a>"+
"        <span>getUserMedia</span></h1>"+

"    <video id=\"gum-local\" autoplay playsinline></video>"+
"    <button id=\"showVideo\">Open camera</button>"+

"    <div id=\"errorMsg\"></div>"+

"    <p class=\"warning\"><strong>Warning:</strong> if you're not using headphones, pressing play will cause feedback.</p>"+

"    <p>Display the video stream from <code>getUserMedia()</code> in a video element.</p>"+

"    <p>The <code>MediaStream</code> object <code>stream</code> passed to the <code>getUserMedia()</code> callback is in"+
"        global scope, so you can inspect it from the console.</p>"+

"    <a href=\"https://github.com/webrtc/samples/tree/gh-pages/src/content/getusermedia/gum\""+
"       title=\"View source for this page on GitHub\" id=\"viewSource\">View source on GitHub</a>"+
"</div>"+

"<script src=\"https://webrtc.github.io/adapter/adapter-latest.js\"></script>"+
"<script src=\"js/main.js\"></script>"+

"<script src=\"../../../js/lib/ga.js\"></script>"+

"</body>"+
"</html>");
socket.getOutputStream().write(httpResponse.getBytes("UTF-8"));
//socket.close();
System.out.println("DISCONNECTED");
System.out.println(text);
//home survalence + lock, video dating by postcode, notifications by gmail to android, when someone visits your page it send you a notification and allows you to msg or join
//dogging.co.uk bio, chat too
//links on iframe href text area java script to java
//<script>
//document.getElementById("demo").innerHTML = "Hello JavaScript!";
//</script> 
//
//</body>
//</html>
//cam software 1 connection
}
}
}
