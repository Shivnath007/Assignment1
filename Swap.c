#include <stdio.h>
#include <conio.h>
void main()
{
    int x, y, z;
    
    printf("Enter two numbers :");
    scanf("%d %d", &x, &y);

    printf("Before swapping numbers are %d and %d\n", x, y);

    z = x;
    x = y;
    y = z;

    printf("After swapping numbers are %d and %d", x, y);

    getch();
}