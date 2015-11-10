package PaymentApplication;

public class PaymentApplication {

	public static void main(String[] args) {
		PaymentSystem paymentSystem = new PaymentSystem();
		
		Salaried paulBlasi = new Salaried("Paul Blasi", 200.00, 1111);
		paymentSystem.addPayee(paulBlasi);
		
		Commissioned carlaT = new Commissioned("Carla is the Name", 40.00, 2222);
		carlaT.addCommission(10.0);
		carlaT.addCommission(10.0);
		paymentSystem.addPayee(carlaT);
		
		
		paymentSystem.processPayments();
		

	}

}
