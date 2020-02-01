abstract class Bank{
abstract int getRateOfInterest();}
class AXIS extends Bank{
int getRateOfInterest(){return 12;}
}
class HDFC extends Bank{
int getRateOfInterest(){return 10;}
}
class AbstractBank{
public static void main(String args[])
{
	Bank b;
	b=new AXIS();
	System.out.println("rate of interest is:"+b.getRateOfInterest()+" %");
	b=new HDFC();
	System.out.println("rate of interest is:"+b.getRateOfInterest()+" %");
}
}