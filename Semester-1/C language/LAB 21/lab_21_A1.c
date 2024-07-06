#include<stdio.h>

void main(){
    FILE *ptr;
    char ch;
    int ln=0,tab=0,sp=0,c=0;
    ptr = fopen("text.txt","r");
    fclose(ptr);
    printf("tabs : %d new line : %d space : %d char : %d", tab,ln,sp,c);
}