#ifndef CALCULATEONE_H
#define CALCULATEONE_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Calculation module one. Calculates the area of a rectangle.
*/

#include <stdio.h>

void calculateOne(void)
{
    double length = 0.0;
    double width = 0.0;
    double area = 0.0;

    printf("\n--- Calculate One Module ---\n");
    printf("This module calculates the area of a rectangle.\n");

    printf("Enter the length: ");
    while (scanf_s("%lf", &length) != 1 || length <= 0)
    {
        printf("Invalid input. Enter a positive number for length: ");
        while (getchar() != '\n')
        {
            /* Clear invalid input */
        }
    }

    printf("Enter the width: ");
    while (scanf_s("%lf", &width) != 1 || width <= 0)
    {
        printf("Invalid input. Enter a positive number for width: ");
        while (getchar() != '\n')
        {
            /* Clear invalid input */
        }
    }

    while (getchar() != '\n')
    {
        /* Clear remaining input */
    }

    area = length * width;
    printf("The area of the rectangle is: %.2f\n", area);
}

#endif
