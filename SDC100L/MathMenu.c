#include <stdio.h>
#include <time.h>   // required for time identification code

int main() {
    // Time identification code
    time_t current_time;
    char* c_time_string;

    current_time = time(NULL);
    c_time_string = ctime(&current_time);
    printf("Current time is %s\n", c_time_string);

    // Variables
    int choice = 0;          // menu choice
    float num1 = 5.50;
    float num2 = 3.25;
    float correctAnswer;
    float userAnswer;

    // Sentinel-controlled loop
    while (choice != 5) {
        // Display menu
        printf("Menu\n");
        printf("1 for Addition\n");
        printf("2 for Subtraction\n");
        printf("3 for Multiplication\n");
        printf("4 for Division\n");
        printf("5 for Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        // Process menu choice
        switch (choice) {
            case 1:
                correctAnswer = num1 + num2;

                printf("\nSolve the following addition problem:\n");
                printf("%.2f + %.2f = ?\n", num1, num2);

                printf("Enter your answer: ");
                scanf("%f", &userAnswer);

                if (userAnswer == correctAnswer) {
                    printf("Correct! Great job!\n\n");
                } else {
                    printf("Wrong answer.\n");
                    printf("The correct answer is %.2f\n\n", correctAnswer);
                }
                break;

            case 2:
                printf("\nSubtraction is not available yet.\n\n");
                break;

            case 3:
                printf("\nMultiplication is not available yet.\n\n");
                break;

            case 4:
                printf("\nDivision is not available yet.\n\n");
                break;

            case 5:
                printf("\nExiting program. Goodbye!\n");
                break;

            default:
                printf("\nInvalid choice. Please enter 1, 2, 3, 4, or 5.\n\n");
        }
    }

    return 0;
}