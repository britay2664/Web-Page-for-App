#ifndef READFILE_H
#define READFILE_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Reads and displays text from group_output.txt.
*/

#include <stdio.h>

void readFile(void)
{
    FILE* filePointer = NULL;
    char line[250];

    printf("\n--- Read File Module ---\n");

    if (fopen_s(&filePointer, "group_output.txt", "r") != 0 || filePointer == NULL)
    {
        printf("No file found yet. Please use option 1 to write to the file first.\n");
        return;
    }

    printf("Contents of group_output.txt:\n");
    printf("---------------------------------\n");

    while (fgets(line, sizeof(line), filePointer) != NULL)
    {
        printf("%s", line);
    }

    printf("---------------------------------\n");
    fclose(filePointer);
}

#endif
