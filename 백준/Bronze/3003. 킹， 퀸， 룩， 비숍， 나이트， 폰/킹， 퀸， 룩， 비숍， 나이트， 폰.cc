#include <stdio.h>

int main(){
    
    int piece_have[10];
    int piece[10] = {1,1,2,2,2,8};
    int result[10];
    int i;
    
    for(i=0; i<6; i++){
        scanf("%d",&piece_have[i]);
    }
    for(i=0; i<6; i++){
        result[i] = piece[i] - piece_have[i];
        printf("%d ",result[i]);
    }
    return 0;
}