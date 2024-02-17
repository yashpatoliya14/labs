#include<stdio.h>

void swap(int *x, int *y){
    int temp = *x;
    *x= *y;
    *y=temp;

}

void main(){
    int a=100,b=200;

swap(&a,&b);

printf(" a : %d\n", a );
printf(" b : %d\n", b );

}