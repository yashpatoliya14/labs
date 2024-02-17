#include<stdio.h>
 
void main(){
    int n,i,j;
    printf("Enter a array size : ");
    scanf("%d", &n);
    int arr1[n];
    int arr2[n];
    for(i=0; i<n; i++){
            scanf("%d", &arr1[i] );
    }
    int *ptr1 = &arr1[0];
    for(i = 0; i < n; i++) {
        arr2[i]= *(ptr1+i);
        int *ptr2= arr2;
        printf("%d ", *(ptr2+i));
    }
}