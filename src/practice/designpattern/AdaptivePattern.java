package practice.designpattern;

public class AdaptivePattern {
public static void main(String[] args) {
	PaymentProcessor googlePaymentProcessor = new GooglePayment(new GooglePaymentProcessor());
	googlePaymentProcessor.executePayment();
	PaymentProcessor paypalPaymentProcessor = new PaypalPayment(new PaypalPaymentProcessor());
	paypalPaymentProcessor.executePayment();
}
}
interface PaymentProcessor{
	void executePayment();
}
class GooglePaymentProcessor{

	public void intiatePayment() {
		System.out.println("Google Payment Processor");
	}

}
class PaypalPaymentProcessor{

	public void intiatePayment() {
		System.out.println("Paypal Payment Processor");
	}
	
}
class GooglePayment implements PaymentProcessor{
	
	GooglePaymentProcessor googlePaymentProcessor;
	
	GooglePayment(GooglePaymentProcessor googlePaymentProcessor){
		this.googlePaymentProcessor = googlePaymentProcessor;
	}
	@Override
	public void executePayment() {
		googlePaymentProcessor.intiatePayment();
	}
	
}
class PaypalPayment implements PaymentProcessor{
	
	PaypalPaymentProcessor paypalPaymentProcessor;
	
	PaypalPayment(PaypalPaymentProcessor paypalPaymentProcessor){
		this.paypalPaymentProcessor = paypalPaymentProcessor;
	}
	@Override
	public void executePayment() {
		paypalPaymentProcessor.intiatePayment();
	}
	
}
