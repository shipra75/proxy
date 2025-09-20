package LockerService.service;

import LockerService.model.Locker;
import LockerService.model.Packages;
import LockerService.model.User;

public class LockerSystem {
    private LockerService lockerService;
    private LockerAllocationStrategy allocationStrategy;
    private OtpGenerator otpGenerator;

    public LockerSystem(LockerService lockerService, LockerAllocationStrategy allocationStrategy, OtpGenerator otpGenerator) {
        this.lockerService = lockerService;
        this.allocationStrategy = allocationStrategy;
        this.otpGenerator = otpGenerator;
    }

    public Locker allocateLockerForDelivery(Packages pkg, User user) {
        Locker locker = allocationStrategy.allocate(lockerService.getAllLockers(), pkg);
            if (locker == null) {
                System.out.println("No locker available");
                return null;
            }
            String otp = otpGenerator.generateOtp();
            locker.assiggnPackage(pkg, otp);
            System.out.println("Locker" + locker.getLocakerId() + "allocated" + user.getName());
            return locker;
        }


    public boolean unlockLocker(String lockerId, String otp) {
        for (Locker locker : lockerService.getAllLockers()) {
            if (locker.getLocakerId().equals(lockerId) && locker.isOccupied() && locker.getOtp().equals(otp)) {
                System.out.println("locker has been unlocked");
                locker.vacate();
                return true;
            }
        }
        System.out.println("invalid OTP");
        return false;
    }
}

