#include <stdio.h>
void fibbo() {
  int n, i;
  printf("Enter a number : ");
  scanf("%d", &n);
  int f[100];
  f[0] = 1;
  f[1] = 1;
  for (i = 2; i <= n; i++) {
    // int j=2;
    f[i] = f[i - 2] + f[i - 1];
    // j++;
  }
  for (i = 0; i < n; i++) {
    printf("%d + ", f[i]);
    
  }
  printf("...");
}
void main() { 
    fibbo(); 
}