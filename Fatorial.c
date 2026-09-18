#include <stdio.h>

int main()
{
    int n, factorial = 1;
    printf("Enter a number to calculate its factorial : ");
    scanf("%d", &n);
    for(int i = 1; i <= n; ++i)
    {
        factorial *= i;    //factorial = factorial * i;
    }
    printf("Factorial of %d = %d", n, factorial);


    return 0;
}