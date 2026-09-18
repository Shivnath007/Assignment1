#include <stdio.h>
#include <conio.h>
int main(){
    int celsius;
    float fahrenheit;

    printf("Enter the value of celsius :");
    scanf("%d", &celsius);

    fahrenheit = (celsius * 1.8 ) + 32;
    printf("The value in fahrenheit is %f F", fahrenheit);

    return 0; 
}