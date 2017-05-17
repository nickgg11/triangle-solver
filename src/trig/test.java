package trig;
import java.util.Scanner;
public class test {
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
				in.nextLine();
				do
				{
					if (a==0)
					{
						if (A>0 && B>0 && b>0)
						{
							a=triggered.sinLawSide(A,b,B);
						}
						else if (A>0 && C>0 && c>0)
						{
							a=triggered.sinLawSide(A, c, C);
						}
						else if (A>0 && b>0 && c>0)
						{
							a=triggered.cosLawSide(A, b, c);
						}
					}
					else if (b==0)
					{
						if (A>0 && a>0 && B>0)
						{
							b=triggered.sinLawSide(A, a, B);
						}
						else if (C>0 && c>0 && B>0)
						{
							b=triggered.sinLawSide(C, C, B);
						}
						else if (B>0 && a>0 && c>0)
						{
							b=triggered.cosLawSide(B, a, c);
						}
					}
					else if (c==0)
					{
						if (C>0 && a>0 && A>0)
						{
							c=triggered.sinLawSide(C, a, A);
						}
						else if (C>0 && b>0 && B>0)
						{
							c=triggered.sinLawSide(C, b, B);
						}
						else if (C>0 && a>0 && b>0)
						{
							c=triggered.cosLawSide(C, a, b);
						}
					}
					else if (A==0)
					{
						if (a>0 && b>0 && B>0)
						{
							A=triggered.sinLawAngle(a, b, B);	
						}
						else if (a>0 && c>0 && C>0)
						{
							A=triggered.sinLawAngle(a, c, C);
						}
						else if  (a>0 && b>0 && c>0)
						{
							A=triggered.cosLawAngle(a, b, c);
						}
					}
					else if (B==0)
					{
						if (b>0 && a>0 && A>0)
						{
							B=triggered.sinLawAngle(A, b, a);
						}
						else if (b>0 && c>0 && C>0)
						{
							B=triggered.sinLawAngle(C, c, b);
						}
						else if (a>0 && b>0 && c>0)
						{
							B=triggered.cosLawAngle(c, b, a);
						}
					}
					else if (C==0)
					{
						if (c>0 && a>0 && A>0)
						{
							C=triggered.sinLawAngle(A, c, a);	
						}
						else if (c>0 && b>0 && B>0)
						{
							C=triggered.sinLawAngle(B, c, a);
						}
						else if (a>0 && b>0 && c>0)
						{
							C=triggered.cosLawAngle(a, b, c);
						}
					}
				} while (a==0 || b==0 || c==0 || A==0 || B==0 || C==0);
				System.out.println("Okay your sides and angles are \nSide a: "+a+"\nSide b: "+b+"\nSide c: "+c+"\nAngle A: "+A+"\nAngle B:"+B+"\nAngle C: "+C);
			}
		}
		while(choice==1||choice==2||choice==3||choice==4||choice==5);
		System.out.println("YOU LEFT NOW YOU HAVE TO START AGAIN.");
	}
}

