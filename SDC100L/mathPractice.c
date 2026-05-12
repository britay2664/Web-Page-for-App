#include <stdio.h>
#include <time.h>
#include <stdlib.h>
#include <ctype.h>

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

    char choice = ' ';
    int numProblems = 0;
    int correctAnswers = 0;

    while (choice != 'E') {
        printf("\nMenu\n");
        printf("A for Addition\n");
        printf("S for Subtraction\n");
        printf("M for Multiplication\n");
        printf("D for Division\n");
        printf("E for Exit\n");
        printf("Enter your choice: ");

        scanf_s(" %c", &choice, 1);
        choice = toupper(choice);

        while (choice != 'A' && choice != 'S' && choice != 'M' && choice != 'D' && choice != 'E') {
            printf("\nInvalid choice. Please enter A, S, M, D, or E: ");
            scanf_s(" %c", &choice, 1);
            choice = toupper(choice);
        }

        switch (choice) {
            case 'A':
                numProblems++;
                correctAnswers += addition();
                break;

            case 'S':
                numProblems++;
                correctAnswers += subtraction();
                break;

            case 'M':
                numProblems++;
                correctAnswers += multiplication();
                break;

            case 'D':
                numProblems++;
                correctAnswers += division();
                break;

            case 'E':
                printf("\nExiting program. Goodbye!\n");
                break;
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
    scanf_s("%d", &userAnswer);

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
    scanf_s("%d", &userAnswer);

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
    scanf_s("%d", &userAnswer);

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
    scanf_s("%d", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct!\n");
        return 1;
    } else {
        printf("Wrong. Answer = %d\n", correctAnswer);
        return 0;
    }
}