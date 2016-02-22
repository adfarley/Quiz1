import java.util.Scanner;
public class qbcalculation {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Scanner input = new Scanner (System.in); //initialized inputs
	System.out.println("Please enter the number of touchdowns.");
	double TD = input.nextInt();
	System.out.println("Please enter the number of yards.");
	double Yards = input.nextInt();
	System.out.println("Please enter the number of interceptions.");
	double INT = input.nextInt();
	System.out.println("Please enter the number of completions.");
	double comp = input.nextInt();
	System.out.println("Please enter the number of passes attempted.");
	double ATT = input.nextInt();
	
	input.close();   //closed input in order to stop memory leak warning
	
	double a = ((comp / ATT) - 0.3) * 5;
	double b = (((Yards / ATT) - 3) * .25);
	double c = ((TD / ATT) * 20);
	double d = 2.375 - ((INT / ATT) * 25);
	double PR = (((a + b + c + d) / 6) * 100);
	
	System.out.println("The calculated Passer Rating is" + " " + PR + ".");
	}

}
