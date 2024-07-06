#include<stdio.h>

int po(int n , int p){
    if(p!=0){
    
        return n * po(n,p-1);
    
    }else{
        return 1;
    }
}
void main(){
    int num,power;
    printf("Enter a number : ");
    scanf("%d", &num);
    printf("Enter a power : ");
    scanf("%d", &power);
    int s = po(num,power);
    printf("%d", s);
}