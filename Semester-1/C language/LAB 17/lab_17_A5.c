#include<stdio.h>
 
void main(){
    int n,i,j;
    printf("Enter a array size : ");
    scanf("%d", &n);
    int arr[n];
    for(i=0; i<n; i++){
            scanf("%d", &arr[i] );
    }
    int *ptr = &arr[0];
    for(i = 0; i < n; i++) {
        printf("%d ", *(ptr+i)); //pointer 1000 + (i=1) = 1004(2)
    }
}