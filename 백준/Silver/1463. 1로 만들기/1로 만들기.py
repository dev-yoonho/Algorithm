import sys
input = sys.stdin.readline

n = int(input())
dp = [0 for i in range(10**6+1)]
dp[1], dp[2], dp[3] = 0, 1, 1

min_value = 0
for i in range(4, n+1):
    min_value = dp[i-1]

    if i % 2 == 0 and dp[i//2] < min_value:
        min_value = dp[i//2]
    if i % 3 == 0 and dp[i//3] < min_value:
        min_value = dp[i//3]
    dp[i] = min_value + 1

print(dp[n])