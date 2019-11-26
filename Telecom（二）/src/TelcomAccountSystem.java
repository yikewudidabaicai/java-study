import user.*;
import factory.*;
import other.*;
import utility.XMLUtility;
public class TelcomAccountSystem{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TelcomUser telcomUser=new TelcomUser("18480500749");
		telcomUser.generateCommunicateRecords();
		telcomUser.printDetails();
		telcomUser.printCallToNumber();
	}
}
