#include <stdio.h>  // Allows me to use printf and scanf

int main(void)
{
    // Variable declarations
    int accountNumber;  // Stores the customer's account number
    float beginningBalance;  // Balance at the start of the month
    float totalCharges;      // Total charges made this month
    float totalCredits;      // Total credits/payments this month
    float creditLimit;       // Allowed credit limit
    float newBalance;        // Calculated new balance

    // Prompt user for the first account number (sentinel-controlled loop)
    printf("Enter account number (-1 to end): ");
    scanf("%d", &accountNumber);

    // Loop continues until user enters -1
    while (accountNumber != -1)
    {
        // Get beginning balance
        printf("Enter beginning balance: ");
        scanf("%f", &beginningBalance);

        // Get total charges
        printf("Enter total charges: ");
        scanf("%f", &totalCharges);

        // Get total credits
        printf("Enter total credits: ");
        scanf("%f", &totalCredits);

        // Get credit limit
        printf("Enter credit limit: ");
        scanf("%f", &creditLimit);

        // Calculate the new balance
        newBalance = beginningBalance + totalCharges - totalCredits;

        // Check if the new balance exceeds the credit limit
        if (newBalance > creditLimit)
        {
            // Display required information if limit is exceeded
            printf("\nAccount Number: %d\n", accountNumber);
            printf("Credit Limit: %.2f\n", creditLimit);
            printf("New Balance: %.2f\n", newBalance);
            printf("Credit Limit Exceeded.\n\n");
        }
        else
        {
            // Optional: display when limit is NOT exceeded
            printf("\nAccount Number: %d\n", accountNumber);
            printf("New Balance: %.2f\n", newBalance);
            printf("Credit limit not exceeded.\n\n");
        }

        // Ask for the next account number (loop continues)
        printf("Enter account number (-1 to end): ");
        scanf("%d", &accountNumber);
    }

    // Program ends when user enters -1
    printf("Program ended.\n");

    return 0;  // Indicates successful program execution
}