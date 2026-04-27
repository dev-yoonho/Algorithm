#include <stdio.h>

int main(){
    int h, m, time;
    scanf("%d %d %d", &h, &m, &time);
    
    h+=time/60;
    m+=time%60;
    if(m>=60){
        ++h;
        m-=60;
    }
    if(h>=24) h-=24;
    
    printf("%d %d", h, m);
    return 0;
}