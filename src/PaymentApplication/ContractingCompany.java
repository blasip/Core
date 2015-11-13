package PaymentApplication;

public class ContractingCompany implements Payee {
	
	public String name;
	public Double grossPay;
	public Integer bankAccount;
	public Double totalPay;

	ContractingCompany(String name, Double grossPay, Integer bankAccount) {
		this.name = name;
		this.grossPay = grossPay;
		this.bankAccount = bankAccount;
		this.totalPay = 0.00;
	}
	public void payForServices(Double amount) {
				
		totalPay += amount;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getGrossPayment() {
		return grossPay + totalPay;
	}

	@Override
	public Integer getBankAccount() {
		return bankAccount;
	}

}
