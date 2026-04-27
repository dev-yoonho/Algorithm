#include <stdio.h>

int main(){
  int c;
  scanf("%d", &c);
  double avg;

  for(int i=0; i<c; i++){
    int num, sum=0;
    int cnt=0;
    scanf("%d", &num);
    int arr[num];
    for(int j=0; j<num; j++){
      scanf("%d", &arr[j]);
      sum+=arr[j];
    }
    avg=sum/num;
    for(int k=0; k<num; k++){
      if(avg<arr[k]) cnt++;
    }
    printf("%.3lf%%\n", (double)cnt/num*100);
  }
  return 0;
}