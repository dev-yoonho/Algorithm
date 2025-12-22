import sys
input = sys.stdin.readline

n = int(input())
n_list = list(map(int, input().split()))

result = n
if n_list.count(1):
    result = n - 1
for i in n_list:
    for j in range(2, i//2+1):
        if i % j == 0:
            result -= 1
            break
print(result)