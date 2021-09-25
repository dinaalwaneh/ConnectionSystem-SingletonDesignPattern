package assigment2;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		//will create new object :
		SingConnection telnetConnection=SingConnection.getInstance(SingConnection.TELNET);
	    //will return the current telnet connection :
		SingConnection telnetConnection2=SingConnection.getInstance(SingConnection.TELNET);
		//will create new object :
		SingConnection sshConnection=SingConnection.getInstance(SingConnection.SSH);
		 
		SingConnection httpConnection=SingConnection.getInstance(SingConnection.HTTP);
		
		SingConnection scpConnection=SingConnection.getInstance(SingConnection.SCP);
	 
	 
		SingConnection sshConnection2=SingConnection.getInstance(SingConnection.SSH);
		
		boolean isReleased=SingConnection.release(SingConnection.TELNET);
		
		SingConnection ftpConnection=SingConnection.getInstance(SingConnection.FTP);
		
		ArrayList<String> currentConnecrion=SingConnection.getcurrentConnection();
		System.out.println(currentConnecrion);
		
		sshConnection.send("sending Hello world via SSH protocol");
		ftpConnection.send("sending Hello world via FTP protocol");
 
		}
	
	
}
