#include <stdio.h>
int main()
{
    int marks;
    printf("Enter your marks: ");
    scanf("%d", &marks);
    if (marks >= 90 && marks <= 100)
    {
        printf("You got an A grade.");
    }
    else if (marks >= 75 && marks < 90)
    {
        printf("You got B grade.");
    }
    else if (marks >= 60 && marks < 75)
    {
        printf("You got C grade.");
    }
    else if (marks >= 45 && marks < 60)
    {
        printf("You got D grade.");
    }
    else
    {
        printf("You failed the examination.");
    }
}