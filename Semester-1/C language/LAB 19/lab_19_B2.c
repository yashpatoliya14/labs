#include<stdio.h>
#include<string.h>
void upr(char str[]){
    int i;
    char str1[100];
    for(i=0;str[i]!='\0';i++){
        str1[i]=str[i]-32;
    }
    // str[i]='\0';
    printf("%s", str1);
}
void main(){
    char str[100];
    gets(str);
    upr(str);
}