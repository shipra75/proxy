package LockerService.service;

import LockerService.model.Locker;
import LockerService.model.Packages;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RandomAllocationStrategy implements LockerAllocationStrategy{
    private Random random = new Random();
    @Override
    public Locker allocate(List<Locker> lockers, Package pkg) {
        List<Locker> freeLockers =lockers.stream().filter(l->!l.isOccupied())
                .collect(Collectors.toList());
        if(freeLockers.isEmpty()){
            return null;
        }
        freeLockers.get(random.nextInt(freeLockers.size()));

    }
}
