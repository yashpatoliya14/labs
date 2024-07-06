#include<stdio.h>

int main(){

    FILE *ptr;
    int n[6];
    ptr=fopen("text.txt","r");
    if(ptr == NULL) {
        printf("Failed to open the file.\n");
        return 1;
    }
    int i;
    for(i=0;i<6;i++) {
        if(fscanf(ptr,"%d",&n[i]) != 1) {
            printf("Failed to read an integer.\n");
            return 1;
        }
    }
    fclose(ptr);
    ptr=fopen("text.txt","w");
    if(ptr == NULL) {
        printf("Failed to open the file.\n");
        return 1;
    }
    for(i=5;i>=0;i--) {
        if(fprintf(ptr,"%d", n[i]) < 0) {
            printf("Failed to write an integer.\n");
            return 1;
        }
    }
    fclose(ptr);
    return 0;
}
