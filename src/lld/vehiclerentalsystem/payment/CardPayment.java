package lld.vehiclerentalsystem.payment;

public class CardPayment implements PaymentInterface {

    @Override
    public void makePayment(Bill bill) {
        //do payment processing and update the bill status;
    }
}
