#include<stdio.h>

void main(){
    int M;
    printf("Enter Month Number(1-12):");
    scanf("%d",&M);

    switch (M)
    {
    case 1:
    case 3:
    case 5:
    case 7:
    case 8:
    case 10:
    case 12:
        printf("31");
        break;
    case 2:
        printf("28");
        break;
    case 4:
    case 6:
    case 9:
    case 11:
        printf("30");
        break;    

    default:
        printf("Invalid Input");
        break;
    }
}