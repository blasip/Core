package PaymentApplication;

public class Commissioned implements Payee {

	String name;
	Double commissionRate;
	Double totalCommissionSales;
	Integer bankAccount; 
	
	Commissioned (String name, Double commissionRate, Double totalCommissionSales, Integer bankAccount) {
		this.name = name;
		this.commissionRate = commissionRate;
		this.totalCommissionSales = totalCommissionSales;
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getGrossPayment() {
		return totalCommissionSales * commissionRate ;
	}

	@Override
	public Integer getBankAccount() {
		return bankAccount;
	}

}
