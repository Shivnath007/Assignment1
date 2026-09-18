#include <stdio.h>
#include <string.h>
void main()
{
    // Reverse the string
    int st = 0;
    char str[20];
    int end = strlen(str);

    puts("Enter the string: ");
    gets(str);
    while (st <= end)
    {
        char ch = str[st];
        str[st] = str[end];
        str[end] = ch;
        st++;
        end--;
    }
    puts(str);
}