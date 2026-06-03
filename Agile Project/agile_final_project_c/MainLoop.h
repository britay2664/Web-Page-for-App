#ifndef MAINLOOP_H
#define MAINLOOP_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Controls the main program loop and connects the menu to each module.
*/

#include <stdio.h>
#include "Menu.h"
#include "writeFile.h"
#include "readFile.h"
#include "calculateOne.h"
#include "calculateTwo.h"

void runMainLoop(void)
{
    int choice = 0;

    do
    {
        displayMenu();
        choice = getMenuChoice();

        switch (choice)
        {
        case 1:
            writeFile();
            printf("\nPress Enter to continue...");
            getchar();
            getchar();
        break;
        case 2:
            readFile();
            printf("\nPress Enter to continue...");
            getchar();
            getchar();
            break;
        case 3:
            calculateOne();
            printf("\nPress Enter to continue...");
            getchar();
            getchar();  
            break;
        case 4:
            calculateTwo();
            printf("\nPress Enter to continue...");
            getchar();
            getchar();
            break;
        case 5:
            printf("Exiting program...\n");
            printf("\nPress Enter to continue...");
            getchar();
            getchar();
            break;
        default:
            printf("Invalid choice. Please select a number from 1 to 5.\n");
            printf("\nPress Enter to continue...");
            getchar();      
            break;
        }

    } while (choice != 5);
}

#endif
