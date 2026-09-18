#include <stdio.h>
int main(){
    int i , j;
    for(i = 0; i < 3; i++)
    {
        for(j = i; j < 2; j++){
            printf("A");
        }
        printf("B");
    }
}