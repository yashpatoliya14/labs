#include<stdio.h>
int fac(int n);
void main(){
    int n;
    scanf("%d", &n); 
    int s=fac(n);
    printf("%d", s);  
}
int fac(int n){
    if(n==1){
        return 1;
    }else{
        return n * fac(n-1);
    }
}