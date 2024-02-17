#include<stdio.h>

void main(){
    int a,b,temp;
    scanf("%d %d", &a ,&b);
    int *ptr1=&a;
    int *ptr2=&b;
    
    temp=*ptr1;
    *ptr1=*ptr2;//ptr2 address store in ptr1
    *ptr2=temp;

    printf("%d %d", *ptr1 , *ptr2);

}