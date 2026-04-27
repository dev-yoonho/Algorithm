#include <stdio.h>

int main(){
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c);
    int prz;
    if(a==b&&b==c) prz=10000+a*1000;
    else if(a==b) prz=1000+a*100;
    else if(b==c) prz=1000+b*100;
    else if(c==a) prz=1000+c*100;
    else {
        int max=a;
        if(b>max) max=b;
        if(c>max) max=c;
        prz=max*100;
    }
    printf("%d\n", prz);
    return 0;
}