#include<stdio.h>

void addNum(int , int );

void main(){
    int a,b;
    scanf("%d %d", &a,&b);
    addNum(a,b);
}
void addNum(int x, int y){

    printf("%d", x+y);
}