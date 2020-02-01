class PersonalLoan
{
	public final String getName()
	{
		return "personal loan";
	}
}
class HomeLoan extends PersonalLoan
{
	@Override
	public final String getName()
	{
		return "home personal loan";//compilation error:overridden method is final
	}
}