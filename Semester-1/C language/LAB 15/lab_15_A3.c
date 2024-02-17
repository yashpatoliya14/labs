#include<stdio.h>
void main(){
    int n,i,count=0;
    printf("Enter a size : ");
    scanf("%d", &n);
    int num[n];

    for(i=0; i<n; i++){
        scanf("%d", &num[i]);
        if(num[i]%3==0){
            count++;
        }  
    }
    printf(" %d number divisible by 3", count);
}