#include <stdio.h>
#include <time.h>
#include <stdlib.h>

void addition();
void subtraction();
void multiplication();
void division();

int main() {
    time_t current_time;
    char* c_time_string;

    current_time = time(NULL);
    c_time_string = ctime(&current_time);
    printf("Current time is %s\n", c_time_string);

    srand(time(NULL));

    int choice = 0;

    while (choice != 5) {
        printf("Menu\n");
        printf("1 for Addition\n");
        printf("2 for Subtraction\n");
        printf("3 for Multiplication\n");
        printf("4 for Division\n");
        printf("5 for Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                addition();
                break;

            case 2:
                subtraction();
                break;

            case 3:
                multiplication();
                break;

            case 4:
                division();
                break;

            case 5:
                printf("\nExiting program. Goodbye!\n");
                break;

            default:
                printf("\nInvalid choice. Please enter 1-5.\n\n");
        }
    }

    return 0;
}

void addition() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 + num2;
    int userAnswer;

    printf("\nSolve:\n");
    printf("%d + %d = ?\n", num1, num2);

    printf("Enter your answer: ");
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n\n");
    } else {
        printf("Wrong. Answer = %d\n\n", correctAnswer);
    }
}

void subtraction() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 - num2;
    int userAnswer;

    printf("\nSolve:\n");
    printf("%d - %d = ?\n", num1, num2);

    printf("Enter your answer: ");
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n\n");
    } else {
        printf("Wrong. Answer = %d\n\n", correctAnswer);
    }
}

void multiplication() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 * num2;
    int userAnswer;

    printf("\nSolve:\n");
    printf("%d * %d = ?\n", num1, num2);

    printf("Enter your answer: ");
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n\n");
    } else {
        printf("Wrong. Answer = %d\n\n", correctAnswer);
    }
}

void division() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;

    if (num2 > num1) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    int correctAnswer = num1 / num2;
    int userAnswer;

    printf("\nSolve integer division:\n");
    printf("%d / %d = ?\n", num1, num2);

    printf("Enter your answer: ");
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n\n");
    } else {
        printf("Wrong. Answer = %d\n\n", correctAnswer);
    }
}