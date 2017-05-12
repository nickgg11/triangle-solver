package trig;
import java.util.Scanner;
public class test {

	public double sides2Angles1(double a, double b, double A)	{
		Trig triggered=new Trig();
		double B=triggered.cosLawAngle(a, b, A);
		double C=180-A-B;
		double c=triggered.sinLawSide(A ,a ,B);
		System.out.println("angles are"+A+" , "+B+" , "+C+" , The side lengths are "+a+" , "+b+" , "+c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trig triggered=new Trig();
		int choice=0;
		
		do{
			System.out.println("\nChoose which math you want to do\n1. Sine Law for a side length\n2. Sine law for an angle\n3. Cosine law for a side length\n4. Cosine law for an angle\n5. Solve full Triangle");
			Scanner in= new Scanner(System.in);
			choice=in.nextInt();
			double A,a,B,b,c,area;

			if (choice==1)
			{
				System.out.println("Give me two angles and a length: ");
				A=in.nextDouble();
				B=in.nextDouble();
				a=in.nextDouble();
				area=triggered.sinLawSide(A,a,B);
				System.out.format("The answer is %,.02f.",area);
			}
			else if (choice==2)
			{

				System.out.println("\nGive me one angle and two lengths: ");
				A=in.nextDouble();
				b=in.nextDouble();
				a=in.nextDouble();
				area=triggered.sinLawAngle(A,a,b);
				System.out.format("The answer is %,.02f.",area);
			}
			else if (choice==3)
			{

				System.out.println("\nGive me one angle and two lengths: ");
				A=in.nextDouble();
				b=in.nextDouble();
				c=in.nextDouble();
				area=triggered.cosLawSide(A,b,c);
				System.out.format("The answer is %,.02f.",area);
			}
			else if (choice==4)
			{
				System.out.println("\nGive me three lengths: ");
				a=in.nextDouble();
				b=in.nextDouble();
				c=in.nextDouble();
				area=triggered.cosLawAngle(a,b,c);
				System.out.format("The answer is %,.02f.",area);
			}
			else if (choice==5)
			{
				System.out.println("Okay input your sides and angles, put zeros for no value");
				System.out.println("side a");
				a=in.nextInt();
				System.out.println("side b");
				b=in.nextInt();
				System.out.println("side c");
				c=in.nextInt();
				System.out.println("angle A");
				A=in.nextInt();
				System.out.println("angle B");
				B=in.nextInt();
				System.out.println("angle C");
				double C=in.nextInt();
				 Sides2Angles1;
			}
			}
		while(choice==1||choice==2||choice==3||choice==4||choice==5);
		System.out.println("YOU LEFT NOW YOU HAVE TO START AGAIN.");
	}
}

