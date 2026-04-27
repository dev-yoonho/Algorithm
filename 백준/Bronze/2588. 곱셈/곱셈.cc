#include <stdio.h>

int main(){
    
    int num1, num2;
    scanf("%d %d", &num1, &num2);
    
    int num3=num1*(num2%10);
    int num4=num1*((num2/10)%10);
    int num5=num1*(num2/100);
    
    printf("%d\n", num3);
    printf("%d\n", num4);
    printf("%d\n", num5);
    printf("%d\n", num5*100+num4*10+num3);
    
    return 0;
}