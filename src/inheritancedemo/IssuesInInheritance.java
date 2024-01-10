package inheritancedemo;

public class IssuesInInheritance {
public static void main(String[] args) {
	HDFC paymentSource = new HDFC();
	System.out.println(paymentSource.perPaymentInterest());
	
	// Java 
	// Abstract entity - no object
	// HAS-A Relation - not allowed
	// IS-A Relation
}
}

abstract class PaymentGateWay{
	public abstract double perPaymentInterest();
}


class HDFC extends PaymentGateWay{
	public double perPaymentInterest() {
		return 7.0;
	}
}

class IFSC extends PaymentGateWay{
	public double perPaymentInterest() {
		return 6.0;
	}
}

class ICICI extends PaymentGateWay{
	public double perPaymentInterest() {
		return 8.0;
	}
}
