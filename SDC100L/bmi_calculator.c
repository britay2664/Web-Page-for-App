#include <stdio.h>

int main() {
    // Declare variables as float (IMPORTANT requirement)
    float weightInPounds, heightInInches, bmi;

    // Ask user for input
    printf("Enter your weight in pounds: ");
    scanf("%f", &weightInPounds);

    printf("Enter your height in inches: ");
    scanf("%f", &heightInInches);

    // Calculate BMI
    bmi = (weightInPounds * 703) / (heightInInches * heightInInches);

    // Display BMI (rounded to 2 decimal places)
    printf("\nYour BMI is: %.2f\n", bmi);

    // Determine BMI category
    if (bmi < 18.5) {
        printf("BMI Category: Underweight\n");
    }
    else if (bmi >= 18.5 && bmi <= 24.9) {
        printf("BMI Category: Normal\n");
    }
    else if (bmi >= 25 && bmi <= 29.0) {
        printf("BMI Category: Overweight\n");
    }
    else {
        printf("BMI Category: Obese\n");
    }

    return 0;
}