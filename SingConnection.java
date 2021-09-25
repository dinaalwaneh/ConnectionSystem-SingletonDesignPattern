package assigment2;
import java.util.*;

 
public class SingConnection {

	//private instance of type SingConnection :
	private static SingConnection Ssh;
	private static SingConnection Telnet;
	private static SingConnection Http;
	private static SingConnection Scp;
	private static SingConnection Ftp;
	
	//protocols state => SingConnection.protocol_name :
	public static String SSH ="SSH";
	public static String TELNET ="TELNET";
	public static String HTTP ="HTTP";
	public static String SCP ="SCP";
	public static String FTP ="FTP";
	
	//counter for number of connection :
	public static int Connection_count=0;
	
	//message via protocol : 
	public  String Message;
	
	//list of connections :
	public static ArrayList<String> list=new ArrayList<String>();  

	//getInstance method to return SingConnection data type to create new object : 
	public static SingConnection getInstance(String ConnectionProtocol) {

				if(ConnectionProtocol==SingConnection.SSH) {
					 
					if((Connection_count<3||(SingConnection.list.contains(SingConnection.SSH)))) {
						if(Ssh==null) {
							Ssh=new SingConnection();
							Connection_count++;
							list.add(SingConnection.SSH);
						}
						else
						{
							System.out.println("object SSH has been founded :) ");
						}
						 
					}
					else
					{
						System.out.println("connection is more than 3 :");
						
					}
					
					return Ssh;	
					
				}else if(ConnectionProtocol==SingConnection.TELNET) {
					 
					if((Connection_count<3)||(SingConnection.list.contains(SingConnection.TELNET))) {
						if(Telnet==null) {
							Telnet=new SingConnection();
							Connection_count++;
							list.add(SingConnection.TELNET);
						}
						else
						{
							System.out.println("object TELNET has been founded :) ");
						}
						 
					}
					else
					{
						System.out.println("connection is more than 3 :");
						
					}
					
					return Telnet;	
					
				}else if(ConnectionProtocol==SingConnection.HTTP) {
					 
					if((Connection_count<3)||(SingConnection.list.contains(SingConnection.HTTP))) {
						if(Http==null) {
							Http=new SingConnection();
							Connection_count++;
							list.add(SingConnection.HTTP);
						}
						else
						{
							System.out.println("object HTTP has been founded :) ");
						}
						 
					}
					else
					{
						System.out.println("connection is more than 3 :");
						
					}
					
					return Http;	
					
				}else if(ConnectionProtocol==SingConnection.SCP) {
					 
					if((Connection_count<3)||(SingConnection.list.contains(SingConnection.SCP))) {
						if(Scp==null) {
							Scp=new SingConnection();
							Connection_count++;
							list.add(SingConnection.SCP);
						}
						else
						{
							System.out.println("object SCP has been founded :) ");
						}
						 
					}
					else
					{
						System.out.println("connection is more than 3 :");
						
					}
					
					return Scp;	
					
				}else if(ConnectionProtocol==SingConnection.FTP) {
					 
					if((Connection_count<3)||(SingConnection.list.contains(SingConnection.FTP))) {
						if(Ftp==null) {
							Ftp=new SingConnection();
							Connection_count++;
							list.add(SingConnection.FTP);
						}
						else
						{
							System.out.println("object FTP has been founded :) ");
						}
						 
					}
					else
					{
						System.out.println("connection is more than 3 :");
						
					}
					
					return Ftp;	
					
				}else {
					System.out.println("protocol is not founded :( ");
				}
				 
				return null;
			
	}
 
	
	//delete specific connection and return true :
	public static boolean release(String ConnectionProtocol) {
		 
		if(ConnectionProtocol==SingConnection.SSH) {
			if(Ssh==null) {
				System.out.println("There are no Ssh connection at all :) ");
			  
			}
			else {
				
				SingConnection.Ssh=null;
				 
				list.remove("SSH");
				Connection_count--;
				return true;
			}
			
		}else if(ConnectionProtocol==SingConnection.TELNET) {
			if(Telnet==null) {
				System.out.println("There are no Telnet connection at all :) ");
			  
			}
			else {
				
				SingConnection.Telnet=null;
				 
				list.remove(SingConnection.TELNET);
				Connection_count--;
				return true;
			}
			
		}else if(ConnectionProtocol==SingConnection.HTTP) {
			if(Http==null) {
				System.out.println("There are no HTTP connection at all :) ");
			  
			}
			else {
				
				SingConnection.Http=null;
				 
				list.remove(SingConnection.HTTP);
				Connection_count--;
				return true;
			}
			
		}else if(ConnectionProtocol==SingConnection.SCP) {
			if(Scp==null) {
				System.out.println("There are no SCP connection at all :) ");
			  
			}
			else {
				
				SingConnection.Scp=null;
				 
				list.remove(SingConnection.SCP);
				Connection_count--;
				return true;
			}
			
		}else if(ConnectionProtocol==SingConnection.FTP) {
			if(Ftp==null) {
				System.out.println("There are no FTP connection at all :) ");
			  
			}
			else {
				
				SingConnection.Ftp=null;
				 
				list.remove(SingConnection.FTP);
				Connection_count--;
				return true;
			}
			
		}else {
			System.out.println("protocol is not founded :( ");
		}
		 
	    return false;
		
		 
	}
	
    //return a list of connections :
	public static ArrayList<String> getcurrentConnection(){
		return list;
	}
     
	//print message :
	public  void send(String string) {
		this.Message=string;
		System.out.println(string);
	}

                                                                                        
	}

