#include <stdio.h>

int main() {
    int seats[10] = {0};   // 0 = empty, 1 = assigned
    int choice;
    int i;
    int assigned;
    char answer;

    while (1) {
        // Check if flight is full
        int full = 1;
        for (i = 0; i < 10; i++) {
            if (seats[i] == 0) {
                full = 0;
                break;
            }
        }

        if (full == 1) {
            printf("Flight is full\n");
            break;
        }

        printf("\nPlease type 1 for \"first-class.\"\n");
        printf("Please type 2 for \"economy.\"\n");
        printf("Enter choice: ");
        scanf("%d", &choice);

        assigned = 0;

        if (choice == 1) {
            // Try first-class seats 1-5
            for (i = 0; i < 5; i++) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    printf("\nBoarding Pass\n");
                    printf("Seat Number: %d\n", i + 1);
                    printf("Section: First-Class\n");
                    assigned = 1;
                    break;
                }
            }

            // If first-class is full
            if (assigned == 0) {
                printf("First-class is full. Would you like economy instead? y/n: ");
                scanf(" %c", &answer);

                if (answer == 'y' || answer == 'Y') {
                    for (i = 5; i < 10; i++) {
                        if (seats[i] == 0) {
                            seats[i] = 1;
                            printf("\nBoarding Pass\n");
                            printf("Seat Number: %d\n", i + 1);
                            printf("Section: Economy\n");
                            assigned = 1;
                            break;
                        }
                    }
                } else {
                    printf("Next flight leaves in 3 hours\n");
                    break;
                }
            }
        }
        else if (choice == 2) {
            // Try economy seats 6-10
            for (i = 5; i < 10; i++) {
                if (seats[i] == 0) {
                    seats[i] = 1;
                    printf("\nBoarding Pass\n");
                    printf("Seat Number: %d\n", i + 1);
                    printf("Section: Economy\n");
                    assigned = 1;
                    break;
                }
            }

            // If economy is full
            if (assigned == 0) {
                printf("Economy is full. Would you like first-class instead? y/n: ");
                scanf(" %c", &answer);

                if (answer == 'y' || answer == 'Y') {
                    for (i = 0; i < 5; i++) {
                        if (seats[i] == 0) {
                            seats[i] = 1;
                            printf("\nBoarding Pass\n");
                            printf("Seat Number: %d\n", i + 1);
                            printf("Section: First-Class\n");
                            assigned = 1;
                            break;
                        }
                    }
                } else {
                    printf("Next flight leaves in 3 hours\n");
                    break;
                }
            }
        }
        else {
            printf("Invalid choice. Please enter 1 or 2.\n");
        }
    }

    return 0;
}