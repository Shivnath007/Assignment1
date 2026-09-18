#include <stdio.h>
#include <conio.h>
int main(){
    int a, b;
    printf("Enter first number : ");
    scanf("%d", &a); 

    printf("Enter second number : ");
    scanf("%d", &b);

    if(a > b){
        printf("First number is greatest.");
    }
    else if(b > a){
        printf("Second number is greatest.");
    }
    else{
        printf("Both are equal.");
    }
    
}