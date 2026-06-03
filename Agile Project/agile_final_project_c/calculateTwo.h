#ifndef CALCULATETWO_H
#define CALCULATETWO_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Calculation module two. Calculates the average of two numbers.
*/

#include <stdio.h>

void calculateTwo(void)
{
    double numberOne = 0.0;
    double numberTwo = 0.0;
    double average = 0.0;

    printf("\n--- Calculate Two Module ---\n");
    printf("This module calculates the average of two numbers.\n");

    printf("Enter the first number: ");
    while (scanf_s("%lf", &numberOne) != 1)
    {
        printf("Invalid input. Enter a valid number: ");
        while (getchar() != '\n')
        {
            /* Clear invalid input */
        }
    }

    printf("Enter the second number: ");
    while (scanf_s("%lf", &numberTwo) != 1)
    {
        printf("Invalid input. Enter a valid number: ");
        while (getchar() != '\n')
        {
            /* Clear invalid input */
        }
    }

    while (getchar() != '\n')
    {
        /* Clear remaining input */
    }

    average = (numberOne + numberTwo) / 2.0;
    printf("The average of %.2f and %.2f is: %.2f\n", numberOne, numberTwo, average);
}

#endif
