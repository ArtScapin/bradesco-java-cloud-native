package interfaces;

public interface AccountInterface {
	
	void withdraw(double value);
	
	void deposit(double value);
	
	void transfer(double value, AccountInterface toAccount);

	void printStatement();
}
