class staff
{
}
	public class Childs extends staff
	{
		public void check()
		{
			System.out.println("sucessfull Casting");
		}
		public static void show(staff p)
		{
			if(p instanceof Childs)
			{
				Childs b1=(Childs)p;
				b1.check();
			}
		}
		public static void main(String[] args)
		{
			staff p=new Childs();
			Childs.show(p);
		}
}
