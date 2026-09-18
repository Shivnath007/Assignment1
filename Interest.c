#include <stdio.h>
#include <conio.h>
int main()
{
    int p, t;
    float r, SI;

    printf("Enter the value of principal : ");
    scanf("%d", &p);

    printf("Enter the number of time(years)");
    scanf("%d", &t);

    printf("Enyter the value of rate :");
    scanf("%f", &r);

    SI = (p * r * t) / 100;
    printf("The interest is %f", SI);
    
    return 0;
}