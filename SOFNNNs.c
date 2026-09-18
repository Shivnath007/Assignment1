#include <stdio.h>

int main()
{
    //sum of first n natural numbers
    int n, i;
    printf("Enter a number : ");
    scanf("%d", &n);
    int sum = 0;
    for (i = 1; i <= n; i++){
        sum += i;
    }
    printf("The sum of first %d natural number is = %d\n", n, sum);

    return 0;
}