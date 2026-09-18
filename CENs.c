#include <stdio.h>

int main()
{
    //count even and odd numbers from 1 to n
    int n , i; 
    printf("Enter a number : ");
    scanf("%d", &n);
    int sum = 0;
    for(i = 1; i <= n; i++){
        if(i % 2 == 0){
            printf("%d is Even number.\n", i);
            sum ++;
        }
    }
    printf("\n");
    printf("Count of even numbers from 1 to %d is %d\n", n, sum);

    return 0;
}