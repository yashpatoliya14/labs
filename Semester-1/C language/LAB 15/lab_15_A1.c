#include<stdio.h>

void main(){
    int n,i,m;
    printf("Enter a size : ");
    scanf("%d", &n);
    m=n;
    int num1[n],num2[m];
    for(i=0; i<n; i++){
        scanf("%d", &num1[i]);  
        num2[i]=num1[i];
    }
    printf("Array 1 : ");
    for(i=0; i<n; i++){
        printf("%d , ", num1[i]);
    }
    printf("Array 2 : ");
    for(i=0; i<n; i++){
        printf("%d , ", num2[i]);
    }
    
}