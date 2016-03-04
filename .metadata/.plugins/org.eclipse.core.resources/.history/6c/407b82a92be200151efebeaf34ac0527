import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class wageCalc {

	public static void main(String[] args) {
		
		double pay;	
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter your wage: ");
		double wage = Double.parseDouble(scan.next());
		
		System.out.print("Hours per week: ");
		double hours = Double.parseDouble(scan.next());
		scan.close();
		
		if(hours >40){
			double overTime = (hours - 40)*wage*1.5;
			pay =(40*wage)+overTime;
		}
		else{
		pay = hours * wage;
		}
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		
		String payFormatted = formatter.format(pay);
		
		System.out.println("This weeks pay will be "+payFormatted);
	}

}
