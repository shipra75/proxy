package LockerService.service;

import LockerService.model.Locker;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LockerService {
    private List<Locker> lockers = new ArrayList<>();
    public void addLocker(Locker locker){
        lockers.add(locker);
    }
    public List<Locker>getAllLockers(){
        return lockers;
    }
    public List<Locker> getOccupiedLockerMoreThanDays( int days) {
        return lockers.stream().filter(Locker::isOccupied).filter(l->
                l.getOccupiedAt().plusDays(days).isBefore(LocalDateTime.now())).collect(Collectors
                .toList());
    }
}
