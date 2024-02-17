#include<stdio.h>
void prime(int a,int b){
    int i,c;
    while(a<=b){
        c=0;
        for(i=1;i<=a;i++){
            if(a%i==0){
                c++;
            }
        }
        if(c==2){
            printf("Prime %d\n", a);
        }
        a++;
    }
}

void main(){
    int n1,n2;
    scanf("%d %d", &n1,&n2);
    prime(n1,n2);
}
