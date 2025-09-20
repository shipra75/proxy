package LockerService.model;


import java.time.LocalDateTime;

public class Locker {
    private String lockerId;
    private boolean occupied;
    private Packages currentPackage;
    private Packages.Size  size;
    private String otp;
    private LocalDateTime occupiedAt;
    public Locker (String lockerId, Package.Size size) {
        this.lockerId = lockerId;
        this.size =size;
        this.occupied = false;
    }
    public String getLocakerId (){
        return lockerId;
    }
    public Package.Size getSize() {
        return size;

    }
    public boolean isOccupied() {
        return occupied;
    }
    public Package getCurrentPackage() {
        return currentPackage;
    }
    public String getOtp() {
        return otp;
    }
    public LocalDateTime getOccupiedAt() {
        return occupiedAt;
    }
    public void assiggnPackage(Packages pkg, String otp){
        this.currentPackage =pkg;
        this.otp=otp;
        this.occupied = true;
        this.occupiedAt =LocalDateTime.now();
    }
    public void vacate() {
        this.currentPackage =null;
        this.otp=null;
        this.occupied=false;
        this.occupiedAt = null;
    }


}