import java.util.Scanner;


class Tuto5Q1{
	public static void main(String args[]){
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter the balance:");
		double bal = scn.nextDouble();
		//double bal=4000.00;
		double bon;
		
		bon = (bal>5000)?(0.05*bal):(0.02*bal);
		
		System.out.println(bon);
		
		
		
		
	}
	
	
}