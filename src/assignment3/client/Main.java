package assignment3.client;

import assignment3.adaptee.MicroUsbPhone;
import assignment3.adapter.MicroUsbToUsbCAdapter;
import assignment3.interfaces.IUsbCCharger;

public class Main {
    public static void main(String[] args) {
        MicroUsbPhone oldPhone = new MicroUsbPhone();
        IUsbCCharger phoneWithAdapter = new MicroUsbToUsbCAdapter(oldPhone);
        phoneWithAdapter.chargeWithUsbC();
    }
}
