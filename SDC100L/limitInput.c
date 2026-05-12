#include <stdio.h>
#include <string.h>

#define MAX_SIZE 10

int main() {

    char data[MAX_SIZE];
    int result;

    puts("Enter your string: ");

    result = scanf_s("%9s", data, MAX_SIZE);

    if (result == 1) {
        puts(data);
    }
    else {
        printf("Your string is too large for the array size.");
    }

    return 0;
}