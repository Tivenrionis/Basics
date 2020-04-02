package com.tiven.questy.Interfaces;

public class Main {

    public static void main(String[] args) {
        ITelephone myPhone;
        myPhone = new DeskPhone(1234567);
        myPhone.powerOn();
        myPhone.callPhone(1234567);
        myPhone.answer();

        myPhone = new MobilePhone(12345);
        myPhone.powerOn();
        myPhone.callPhone(12345);
        myPhone.answer();

    }


}
