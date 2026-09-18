#include <stdio.h>
int main()
{
    float num1, num2;
    char op;

    printf("Enter first number: ");
    scanf("%f", &num1);

    printf("Enter symbol to perform operation ( + , - , * , / ): ");
    scanf(" %c", &op);

    printf("Enter second number: ");
    scanf("%f", &num2);

    switch (op)
    {
    case '+':
        printf("The sum of %f and %f is ", num1 + num2);
        break;

    case '-':
        printf("The subtration of %f and %f is ", num1 - num2);
        break;

    case '*':
        printf("The multiplication of %f and %f is ", num1 * num2);
        break;

    case '/':
        if (num2 == 0)
            printf("Error! Division by zero is not allowed.");
        else
            printf("The division of %f by %f is ", num1 / num2);
        break;

    default:
        printf("Error! operator is not correct.");
        break;
    }
}