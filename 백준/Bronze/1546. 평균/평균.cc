#include <stdio.h>

int main(){
    int n, x, max=0; 
    double ans=0; // 누적합
    
    scanf("%d", &n);
    for(int i=0; i<n; i++){
        scanf("%d", &x);
        ans+=x;
        if(max<x) max=x;
    } // 누적합과 최댓값 산출 완료
    
    ans=ans/max*100/n;
    printf("%lf", ans);
    return 0;
    
}