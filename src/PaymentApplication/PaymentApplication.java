package PaymentApplication;

public class PaymentApplication {

	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		
		Salaried paulBlasi = new Salaried("Paul Blasi", 200.00, 1111);
		paulBlasi.giveBonus(20.00);
		paymentSystem.addPayee(paulBlasi);
		
		Commissioned carlaT = new Commissioned("Carla is the Name", 40.00, 2222);
		carlaT.addCommission(10.0);
		carlaT.addCommission(10.0);
		carlaT.giveBonus(20.00);
		paymentSystem.addPayee(carlaT);
		
		ContractingCompany company = new ContractingCompany("Wes University", 4000.00, 9956);
		company.payForServices(1000.00);
		company.payForServices(999.99);
		paymentSystem.addPayee(company);
		
		
		
		
		
		paymentSystem.processPayments();
		

	}

}
