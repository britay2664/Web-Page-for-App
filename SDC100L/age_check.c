#include <stdio.h>

int main() {
    int age;

    // Ask user for age
    printf("Enter your age: ");
    scanf("%d", &age);

    // Check conditions
    if (age < 18) {
        printf("You are a minor.\n");
    }
    else if (age >= 18 && age <= 65) {
        printf("You are of working age.\n");
    }
    else {
        printf("You are retired.\n");
    }

    return 0;
}