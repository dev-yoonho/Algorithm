import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

dp = [0] * (10**6 + 1)
dp[1], dp[2] = 1, 2

n = int(input())

for i in range(3, n+1):
    dp[i] = (dp[i-1] + dp[i-2]) % 15746

print(dp[n])