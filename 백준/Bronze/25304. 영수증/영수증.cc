#include <stdio.h>

int main(){
    int x, n, a, b;
    scanf("%d %d", &x, &n);
    int sum=0;
    for(int i=1;i<=n;i++){
        scanf("%d %d", &a, &b);
        sum+=a*b;
    }
    if(sum==x) printf("Yes\n");
    else printf("No\n");
    return 0;
}