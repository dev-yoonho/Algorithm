import sys
input = sys.stdin.readline

n, m = map(int, input().split())
n_list = list(map(int, input().split()))

def win_case(n_list):
    result = 0
    length = len(n_list)
    
    for i in range(length):
        for j in range(i+1, length):
            for k in range(j+1, length):
                cur_sum = n_list[i]+n_list[j]+n_list[k]
                
                if cur_sum <= m:
                    result = max(result, cur_sum)
    return result

print(win_case(n_list))