#include <stdio.h>

int main(){
    int x, y;
    scanf("%d %d", &x, &y);
    
    int ret;
    
    if(y>0){
        if(x>0)ret=1;
        else ret=2;
    }
    else{
        if(x<0)ret=3;
        else ret=4;
    }
    
    printf("%d\n", ret);
    
    return 0;
    
}