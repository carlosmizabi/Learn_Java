package polymorfism;

public class Comparator {
	
	public int getMax(int n, int m) 
	{
		double nn = n;
		double mm = m;
		int result = (int)getMax(nn, mm);
		return result;
	}
	public double getMax(double d1, double d2) 
	{
		if (d1 > d2) {
			return d1;
		} else {
			return d2;
		}
	}
	public String getMax(String number1, String number2) 
	{
		int n1 = Integer.parseInt(number1);
		int n2 = Integer.parseInt(number2);
		String result = Double.toString(getMax(n1, n2));
		return result;
	}
}