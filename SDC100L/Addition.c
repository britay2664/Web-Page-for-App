#include <stdio.h>

int main() {
    float num1 = 5.50;
    float num2 = 3.25;
    float correctAnswer;
    float userAnswer;

    correctAnswer = num1 + num2;

    printf("Solve the following problem:\n");
    printf("%.2f + %.2f = ?\n", num1, num2);

    printf("Enter your answer: ");
    scanf("%f", &userAnswer);

    if (userAnswer == correctAnswer) {
        printf("Correct! Great job!\n");
    } else {
        printf("Wrong answer.\n");
        printf("The correct answer is %.2f\n", correctAnswer);
    }

    return 0;
}