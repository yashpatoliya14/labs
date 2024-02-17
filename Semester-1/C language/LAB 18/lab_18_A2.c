#include<stdio.h>

void max(int x,int y){
    if(x>y){
        printf("max : %d \n", x);
    }else{
        printf("max : %d \n", y);
    }
}
void min(int x,int y){
    if(x<y){
        printf("min : %d \n", x);
    }else{
        printf("min : %d \n", y);
    }
}

void main(){
    int a,b;
    scanf("%d %d", &a,&b);
    max(a,b);
    min(a,b);


}