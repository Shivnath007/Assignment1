#include <stdio.h>
#include <conio.h>
void main(){
    float r , pi = 3.14;
    printf("Enter the radius of circle :");
    scanf("%f", &r);
    printf("The area of circle is %f :", pi * r * r);
    getch();
}