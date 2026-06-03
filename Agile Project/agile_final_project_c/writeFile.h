#ifndef WRITEFILE_H
#define WRITEFILE_H

/*
    Author: Team 4 Brian Taylor, Alex Smith, Raymond Wagner, and Mason White
    Date: June 2026
    Purpose: Writes user-entered text to a file named group_output.txt.
*/

#include <stdio.h>
#include <string.h>

void writeFile(void)
{
    FILE* filePointer = NULL;
    char text[250];

    printf("\n--- Write File Module ---\n");
    printf("Enter text to save to the file: ");

    if (fgets(text, sizeof(text), stdin) == NULL)
    {
        printf("Error reading input.\n");
        return;
    }

    text[strcspn(text, "\n")] = '\0';

    if (fopen_s(&filePointer, "group_output.txt", "a") != 0 || filePointer == NULL)
    {
        printf("Error: Could not open file for writing.\n");
        return;
    }

    fprintf(filePointer, "%s\n", text);
    fclose(filePointer);

    printf("Text was successfully written to group_output.txt.\n");
}

#endif
