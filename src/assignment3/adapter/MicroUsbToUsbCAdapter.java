package assignment3.adapter;

import assignment3.adaptee.MicroUsbPhone;
import assignment3.interfaces.IUsbCCharger;

public class MicroUsbToUsbCAdapter implements IUsbCCharger {
    private final MicroUsbPhone microUsbPhone;

    public MicroUsbToUsbCAdapter(MicroUsbPhone microUsbPhone) {
        this.microUsbPhone = microUsbPhone;
    }

    @Override
    public void chargeWithUsbC() {
        System.out.println("Adapter converts from UsbC to MicroUsb");
        microUsbPhone.chargePhoneWithMicroUsb();
    }
}
