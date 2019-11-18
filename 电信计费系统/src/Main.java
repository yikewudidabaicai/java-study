//import rate.*;
import telcomUser.TelcomUser;
//import company.*;


public class Main{

	public static void main(String[] args) {
	
		TelcomUser telcomUser = new TelcomUser("18338305122");
	
		
		telcomUser.generateCommunicateRecord();
		
		telcomUser.printDetails();
		
	}

}