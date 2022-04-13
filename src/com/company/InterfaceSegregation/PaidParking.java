package com.company.InterfaceSegregation;

public interface PaidParking extends ParkingLot {
    double calculateFee(Car car );
    void doPayment(Car car);

}
