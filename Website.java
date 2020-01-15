import java.util.Scanner;

public class Website {

public static void main (String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	System.out.println ("please enter one web link");
	String weblinK = input.nextLine();
	
	
		String domain = getDomainName(weblinK);
		System.out.println(" domain is: " + domain);
		
}
		
	
	static String getDomainName( String weblink) {
		
		String weblinkSum = weblink.substring(weblink.indexOf('.') + 1, weblink.lastIndexOf('.'));
		return weblinkSum;
		
	
	}

}

// method name should be more clearly name.
