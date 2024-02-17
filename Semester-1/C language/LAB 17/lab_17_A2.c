#include<stdio.h>

void main(){
    int a=5;
    float b=5.0;
    double c=5.152418;
    char d='Y';
    int *ptr1=&a;
    float *ptr2=&b;
    double *ptr3=&c;
    char *ptr4=&d;
    printf("%d %f %lf %c", *ptr1 ,*ptr2 ,*ptr3 ,*ptr4);

}