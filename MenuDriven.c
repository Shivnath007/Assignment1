#include <stdio.h>
int main()
{
    int num1, num2, result;
    int choice = 0;
    do
    {
        printf("Menu Driven Program\n");
        printf("1. Addition\n");
        printf("2. Subtraction\n");
        printf("3. Multiply\n");
        printf("4. Exit\n");
        printf("Enter your choice: ");
        scanf("%d", &choice);
        switch (choice)
        {
        case 1:
            printf("Enter first number: ");
            scanf("%d", &num1);
            printf("Enter second number: ");
            scanf("%d", &num2);
            result = num1 + num2;
            printf("Addition of %d and %d is: %d\n", num1, num2, result);
            break;
        case 2:
            printf("Enter first number: ");
            scanf("%d", &num1);
            printf("Enter second number: ");
            scanf("%d", &num2);
            result = num1 - num2;
            printf("Subtraction of %d and %d is: %d\n", num1, num2, result);
            break;
        case 3:
            printf("Enter first number: ");
            scanf("%d", &num1);
            printf("Enter second number: ");
            scanf("%d", &num2);
            result = num1 * num2;
            printf("Multiplication of %d and %d is: %d\n", num1, num2, result);
            break;
        case 4:
            printf("Exiting...\n");
            break;
        default:
            printf("Invalid choice. Please try again.\n");
        }
    } while (choice != 4);
}