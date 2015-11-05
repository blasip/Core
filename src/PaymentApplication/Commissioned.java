package PaymentApplication;

public class Commissioned implements Payee {

	private String name;
	private Double commAmount;
	private Integer bankAccount; 
	
	public Commissioned (String name, Double commAmount, Integer bankAccount) {
		this.name = name;
		this.commAmount = commAmount;
		this.bankAccount = bankAccount;
	}
	
	@Override
	public String getName() {
		return name;
	}

	@Override
	public Double getGrossPayment() {
		return commAmount;
	}

	@Override
	public Integer getBankAccount() {
		return bankAccount;
	}

}
