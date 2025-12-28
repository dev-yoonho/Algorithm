import sys
input = sys.stdin.readline

n, k = map(int, input().split())

if k > n // 2:
    k = n - k

answer = 1
for i in range(n, n-k, -1):
    answer *= i

for j in range(2, k+1):
    answer //= j

print(answer)