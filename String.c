#include<stdio.h>
int main(){
    int i = 0;
    char str[] = "Shiva Shiva";
    while(str[i] != '\0'){
        printf("%c ", str[i]);
        i++;
    }
    return 0;
}