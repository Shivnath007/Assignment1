#include <stdio.h>
#include <conio.h>
int main()
{
    int num;
    printf("Enter number to check whether it is even or odd : ");
    scanf("%d", &num);
    if (num % 2 == 0)
    {
        printf("The entered number is even.");
    }
    else
    {
        printf("The entered number is odd.");
    }
    return 0;
}