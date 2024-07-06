#include<stdio.h>

void print1(int array[], int n){
    int i;
    for(i=0;i<n;i++){
        printf("%d", array[i]);
    }
}

int main(){
    int n,i;
    printf("Enter the size of the array: ");
    scanf("%d", &n);
    int array[n];
    printf("Enter the elements of the array: ");
    for(i=0;i<n;i++){
        scanf("%d", &array[i]);
    }
    print1(array,n);
    return 0;
}
