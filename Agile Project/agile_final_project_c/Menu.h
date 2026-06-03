#ifndef MENU_H
#define MENU_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Displays the menu and gets the user's menu choice.
*/

#include <stdio.h>

void displayMenu(void)
{
    printf("\n----------- Main Menu -----------\n");
    printf("1. Write text to a file\n");
    printf("2. Read text from a file\n");
    printf("3. Calculate area of a rectangle\n");
    printf("4. Calculate average of two numbers\n");
    printf("5. Exit\n");
    printf("---------------------------------\n");
}

int getMenuChoice(void)
{
    int choice = 0;

    printf("Enter your choice: ");
    while (scanf_s("%d", &choice) != 1)
    {
        printf("Invalid input. Please enter a number from 1 to 5: ");
        while (getchar() != '\n')
        {
            /* Clear invalid input */
        }
    }

    while (getchar() != '\n')
    {
        /* Clear remaining input */
    }

    return choice;
}

#endif
