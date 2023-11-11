import sys

n, m = map(int, sys.stdin.readline().split())
num = list(map(int, sys.stdin.readline().split()))

prefix_sum = [0]
temp = 0

for i in num:
    temp += i
    prefix_sum.append(temp)
    
for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    print(prefix_sum[j] - prefix_sum[i - 1])