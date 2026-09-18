#include <stdio.h>
int main()
{
    int n, sum = 0, digit;
    printf("Enter a number to calculate the sum of its digits: ");
    scanf("%d", &n);
    while (n > 0)
    {
        digit = n % 10;
        sum += digit;
        n /= 10;
    }
    printf("The sum of the digits is: %d", sum);
}