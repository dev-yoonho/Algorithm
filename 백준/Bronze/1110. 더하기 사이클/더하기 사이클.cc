#include <stdio.h>

int main(){
    int inp, n, count=0;
    scanf("%d", &inp);
    
    n=inp;
    do{
        n=(n%10)*10+((n/10)+(n%10))%10;
        count++;
    } while(n!=inp);
    printf("%d\n", count);
    return 0;
}