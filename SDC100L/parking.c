#include <stdio.h>
#include <math.h>

float calculateCharges(float hours);

int main() {
    float hours1, hours2, hours3;
    float charge1, charge2, charge3;
    float totalHours, totalCharges;

    printf("Enter hours parked for customer 1: ");
    scanf("%f", &hours1);

    printf("Enter hours parked for customer 2: ");
    scanf("%f", &hours2);

    printf("Enter hours parked for customer 3: ");
    scanf("%f", &hours3);

    charge1 = calculateCharges(hours1);
    charge2 = calculateCharges(hours2);
    charge3 = calculateCharges(hours3);

    totalHours = hours1 + hours2 + hours3;
    totalCharges = charge1 + charge2 + charge3;

    printf("\n%-10s %-10s %-10s\n", "Car", "Hours", "Charge");
    printf("%-10d %-10.2f $%-10.2f\n", 1, hours1, charge1);
    printf("%-10d %-10.2f $%-10.2f\n", 2, hours2, charge2);
    printf("%-10d %-10.2f $%-10.2f\n", 3, hours3, charge3);
    printf("%-10s %-10.2f $%-10.2f\n", "TOTAL", totalHours, totalCharges);

    return 0;
}

float calculateCharges(float hours) {
    float charge;

    if (hours <= 3) {
        charge = 20.00;
    } else {
        charge = 20.00 + (ceil(hours) - 3) * 5.00;
    }

    if (charge > 50.00) {
        charge = 50.00;
    }

    return charge;
}