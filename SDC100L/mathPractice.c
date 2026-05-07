#include <stdio.h>
#include <time.h>
#include <stdlib.h>

int addition();
int subtraction();
int multiplication();
int division();

int main() {
    char programTitle[] = "Brian Taylor Math Program Practice Main Menu";

    time_t current_time;
    char* c_time_string;

    current_time = time(NULL);
    c_time_string = ctime(&current_time);

    puts(programTitle);
    printf("Current time is %s\n", c_time_string);

    srand(time(NULL));

    int choice = 0;
    int numProblems = 0;
    int correctAnswers = 0;

    while (choice != 5) {
        printf("\nMenu\n");
        printf("1 for Addition\n");
        printf("2 for Subtraction\n");
        printf("3 for Multiplication\n");
        printf("4 for Division\n");
        printf("5 for Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);

        switch (choice) {
            case 1:
                numProblems++;
                correctAnswers += addition();
                break;

            case 2:
                numProblems++;
                correctAnswers += subtraction();
                break;

            case 3:
                numProblems++;
                correctAnswers += multiplication();
                break;

            case 4:
                numProblems++;
                correctAnswers += division();
                break;

            case 5:
                printf("\nExiting program. Goodbye!\n");
                break;

            default:
                printf("\nInvalid choice.\n");
        }
    }

    printf("\n=== Program Statistics ===\n");
    printf("Total problems attempted: %d\n", numProblems);
    printf("Correct answers: %d\n", correctAnswers);

    if (numProblems > 0) {
        float percent = ((float)correctAnswers / numProblems) * 100;
        printf("Percent correct: %.2f%%\n", percent);
    } else {
        printf("Percent correct: 0.00%%\n");
    }

    return 0;
}

int addition() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 + num2;
    int userAnswer;

    printf("\n%d + %d = ?\n", num1, num2);
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n");
        return 1;
    } else {
        printf("Wrong. Answer = %d\n", correctAnswer);
        return 0;
    }
}

int subtraction() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 - num2;
    int userAnswer;

    printf("\n%d - %d = ?\n", num1, num2);
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n");
        return 1;
    } else {
        printf("Wrong. Answer = %d\n", correctAnswer);
        return 0;
    }
}

int multiplication() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;
    int correctAnswer = num1 * num2;
    int userAnswer;

    printf("\n%d * %d = ?\n", num1, num2);
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n");
        return 1;
    } else {
        printf("Wrong. Answer = %d\n", correctAnswer);
        return 0;
    }
}

int division() {
    int num1 = rand() % 100 + 1;
    int num2 = rand() % 100 + 1;

    if (num2 > num1) {
        int temp = num1;
        num1 = num2;
        num2 = temp;
    }

    int correctAnswer = num1 / num2;
    int userAnswer;

    printf("\n%d / %d = ?\n", num1, num2);
    scanf("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n");
        return 1;
    } else {
        printf("Wrong. Answer = %d\n", correctAnswer);
        return 0;
    }
}