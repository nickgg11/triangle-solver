package trig;
import java.util.Scanner;
public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trig triggered=new Trig();
		int choice=0;
		do{
			System.out.println("Choose which math you want to do\n1. Sine Law for a side length\n2. Sine law for an angle\n3. Cosine law for a side length\n4. Cosine law for an angle");
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
		}
		while(choice==1||choice==2||choice==3||choice==4);
	}
}

