#include <stdio.h>

int main(){
    int n, i, check[30]={0};
    
    for(i=0; i<28; i++){
        scanf("%d", &n);
        check[n-1]=1;
    }
    for(i=0; i<30; i++){
        if(check[i]!=1) printf("%d\n", i+1);
    }
    return 0;
}