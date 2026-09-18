#include <stdio.h>
#include <conio.h>
int main()
{
    int num;
    printf("Enter number to check whether it is positive , negative or zero : ");
    scanf("%d", &num);
    if (num > 0)
    {
        printf("Entered number is positive.");
    }
    else if (num < 0)
    {
        printf("Entered number is negative.");
    }
    else
    {
        printf("Number is zero.");
    }
    return 0;
}