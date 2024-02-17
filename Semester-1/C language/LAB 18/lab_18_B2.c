#include<stdio.h>
#include<math.h>

void prime(int n){
    int i,c=0;
    for(i=0; i<=n; i++){
        if(n%i==0){
            c++;
        }
    }
    if(c==2){
        printf("Number is prime.");
    }else{
        printf("Number is not prime.");
    }
}
void armstrong(int n){
    int c=0,sum=0,mul=1,temp;
    temp=n;
    while(n!=0){
        n=n/10;
        c++;
    }
    n=temp;
    while(n!=0){
        int rem;
        rem=n%10;
        mul=pow(rem,c);
        sum+=mul;
        n=n/10;
        
    }
    // printf("%d",sum);
    if(sum==temp){
        printf("Arm");

    }else{
        printf("NOT Arm");
    }
}
void perfect(int n){
    int i=0,sum=0;
    while(i<n){
        if(n%i==0){
            printf("%d",i);
            sum+=i;
        }
        i++;
    }
    if(sum==n){
        printf("\nPerfect Number");
    }else{
        printf("\nNot Perfect Number");
    }
} 


void main(){
    int n;
    printf("Enter a number :");
    scanf("%d",&n);
    prime(n);
    armstrong(n);
    perfect(n);
}