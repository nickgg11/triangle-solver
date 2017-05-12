package trig;

public class Trig {
	public double toRad (double A)
	{
		return A * Math.PI / 180;
	}
	public double toDeg (double A)
	{
		return A * 180 / Math.PI;
	}

	public double sinLawSide(double A, double a, double B)
	{
		A = toRad(A);
		B = toRad(B);
		return a * Math.sin(B) / Math.sin(A);
	}

	public double sinLawAngle(double A, double a, double b)
	{
		A = toRad(A);
		return toDeg(Math.asin(Math.sin(A) * b / a));
	}

	public double cosLawSide(double A, double b, double c)
	{
		A = toRad(A);
		return Math.sqrt (Math.pow(b, 2) + Math.pow(c, 2)- (2 * b * c * Math.cos(A)));
	}

	public double cosLawAngle(double a, double b, double c)
	{
		return toDeg( Math.acos((Math.pow(a, 2) - Math.pow(b, 2) - Math.pow(c, 2)) / (-2 * b * c)));
	}
}
