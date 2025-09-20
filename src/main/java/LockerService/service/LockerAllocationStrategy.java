package LockerService.service;

import LockerService.model.Locker;
import LockerService.model.Packages;

import java.util.List;

public interface LockerAllocationStrategy {
    Locker allocate(List<Locker> packages, Packages pkg);
}
