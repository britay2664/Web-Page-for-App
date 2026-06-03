/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Main application file for a menu-driven C program.
             This file starts the program and calls the main loop.
*/

#include <stdio.h>
#include "Menu.h"
#include "MainLoop.h"

int main(void)
{
    printf("========================================\n");
    printf(" Agile Final Project - Menu Application \n");
    printf("========================================\n\n");

    runMainLoop();

    printf("\nThank you for using the application. Goodbye!\n");
    return 0;
}
