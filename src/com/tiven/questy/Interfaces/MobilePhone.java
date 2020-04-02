package com.tiven.questy.Interfaces;

public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn;

    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
        this.isOn = false;
    }

    @Override
    public void powerOn() {
        this.isOn = true;
        System.out.println("Mobile phone powered on");

    }

    @Override
    public void dial(int phoneNumber) {
        if (isOn) {
            System.out.println("Now ringing " + phoneNumber + " on mobile phone");
        } else System.out.println("Phone is switched off");
    }

    @Override
    public void answer() {
        if (this.isRinging) {
            System.out.println("Answering mobile phone");
            isRinging = false;
        }

    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if (this.myNumber == phoneNumber && this.isOn) {
            this.isRinging = true;
            System.out.println("Melody ring");
        } else {
            this.isRinging = false;
        }
        return false;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
