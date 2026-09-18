#include <stdio.h>
int main()
{
    //Count the number of vowels in a string
    char str[100];
    int count = 0;
    printf("Enter the string: ");
    scanf("%s", str);
    for (int j = 0; str[j] != '\0'; j++)
    {
        if (str[j] == 'a' || str[j] == 'e' || str[j] == 'i' || str[j] == 'o' || str[j] == 'u' || str[j] == 'A' || str[j] == 'E' || str[j] == 'I' || str[j] == 'O' || str[j] == 'U')
        {
            count++;
        }
    }
    printf("The number of vowels in the string is: %d", count);
}