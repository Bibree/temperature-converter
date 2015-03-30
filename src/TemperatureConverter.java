import java.util.Scanner; 

public class TemperatureConverter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println ("If you want to go from Celsius to Fahrenheit type 1, else type in 2 ");
		
				
Scanner keyboard = new Scanner(System.in);
double choice;

double fahrenheit;
double answer;
double answer2;

double celsius2;

double celsius,fah;
choice= keyboard.nextDouble(); 
System.out.println ("Type in the number you want to convert");
celsius= keyboard.nextDouble();
System.out.println ("type again");

fah= keyboard.nextDouble(); 
if (choice==1)
	
{	

fahrenheit= celsius*9/5+32;

answer=fahrenheit;

	System.out.println ("Your answer in Fahrenheit is " + answer);
	celsius2= keyboard.nextInt(); 

	fah= keyboard.nextInt();
	}

else 
celsius2=5*(fah-32)/9;
answer2= celsius2;
    System.out.println("Your answer in Celsius is "+answer2);
	
	}
	}
