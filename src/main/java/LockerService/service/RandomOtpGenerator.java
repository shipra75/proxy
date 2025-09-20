package LockerService.service;

import java.util.Random;

public class RandomOtpGenerator implements OtpGenerator{

    private Random random = new Random();
    @Override
    public String generateOtp() {
        int otp =100000+random.nextInt(900000);
        return String.valueOf(otp);
    }
}
