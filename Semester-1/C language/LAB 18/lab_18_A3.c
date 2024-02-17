#include <stdio.h>

int sim(int r, int i, int t)
{
    int res = (r * i * t) / 100;
    return res;
}

void main()
{
    int r, i, t;
    printf("Enter rupees,interest,time : ");
    scanf("%d %d %d", &r, &i, &t);
    
    int total = sim(r, i, t);
    
    printf("%d", total);
}