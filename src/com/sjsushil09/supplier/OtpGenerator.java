package com.sjsushil09.supplier;

import java.util.function.Supplier;

public class OtpGenerator {
    public static void main(String[] args) {
        Supplier<String> otpSupplier = ()->{
            String otp="";
            for(int i=0;i<6;i++)
                otp+=(int)(Math.random()*10);
            return otp;
        };
        System.out.println(otpSupplier.get());
    }
}
