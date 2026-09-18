#include<stdio.h>
int main(){
    int n, r, sum = 0, temp;
    printf("Enter a number: ");
    scanf("%d", &n);
    temp = n;
    
    while(n > 0){
        r = n % 10;
        sum = sum + r * r * r;
        n = n / 10;
    }
    printf("%d is a armstrong number", sum);
    return 0;
}