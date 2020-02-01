interface Bank{
float rateOfInterest();
}
class ICICI implements Bank{
public float rateOfInterest()
{return 9.15f;}
}
class CITI implements Bank{
public float rateOfInterest()
{return 9.7f;}
}
class InterfaceDemo{
public static void main(String[] args)
{
	Bank b=new ICICI();
	System.out.println("ROI: "+b.rateOfInterest());
}
}