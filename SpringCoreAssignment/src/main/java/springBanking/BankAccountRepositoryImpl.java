package springBanking;

public abstract class BankAccountRepositoryImpl implements BankAccountRepository
{
	@SuppressWarnings("unused")
	private void BankAccountRepositoryImplementation()
	{
		BankAccount bankAccount = new BankAccount();
		bankAccount.setAccountHolderName("Shuaib");
		bankAccount.setAccountId(12);
		bankAccount.setAccountType("Savings");
		bankAccount.setAccountBalance((long) 20000.222);
	}
	
	

}
