#include <stdio.h>

float max(float x, float y, float z) {
  if (x > y) {
    if (x > z) {
      return x;
    } else {
      return z;
    }
  } else {
    if (y > z) {
      return y;
    } else {
      return z;
    }
  }
}

void main() {

  float a, b, c;
  scanf("%f %f %f", &a, &b, &c);

  float res = max(a, b, c);
  printf("%f", res);
}