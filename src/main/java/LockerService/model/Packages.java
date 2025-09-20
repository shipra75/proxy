package LockerService.model;

public class Packages {
    public enum Size { small, medium, large};
    public String packageId;
    public Size size;
    public Packages( String packageId, Size size) {
        this.packageId=packageId;
        this.size = size;
    }
    public String getPackageId(){
        return packageId;
    }
    public Size getSize(){
        return size;
    }
}
