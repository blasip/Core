package PaymentApplication;

public class Commissioned extends Employee {

	Double commissionedAmount;

	public Commissioned(String name, Double grossPay, Integer bankAccount) {
		super(name, grossPay, bankAccount);
		commissionedAmount = 0.00;
	}

	public void addCommission(Double amount) {
		commissionedAmount = commissionedAmount + amount;
		
	}
	
	@Override
	public Double getGrossPayment() {
		return grossPay + commissionedAmount;
	}
	
}
