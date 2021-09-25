package assigment2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//will create new object :
		SingConnection telnetConnection=SingConnection.getInstance(SingConnection.TELNET);
	    //will return the current telnet connection :
		SingConnection telnetConnection2=SingConnection.getInstance(SingConnection.TELNET);
		//will create new object :
		SingConnection sshConnection=SingConnection.getInstance("SSH");
		 
		SingConnection httpConnection=SingConnection.getInstance("HTTP");
		
		SingConnection scpConnection=SingConnection.getInstance("SCP");
	 
	 
		SingConnection sshConnection2=SingConnection.getInstance("SSH");
		
		boolean isReleased=SingConnection.release(SingConnection.TELNET);
		
		SingConnection ftpConnection=SingConnection.getInstance("FTP");
		
		ArrayList<String> currentConnecrion=SingConnection.getcurrentConnection();
		System.out.println(currentConnecrion);
		
		sshConnection.send("sending Hello world via SSH protocol");
		ftpConnection.send("sending Hello world via FTP protocol");
 
		}
	
	
}
