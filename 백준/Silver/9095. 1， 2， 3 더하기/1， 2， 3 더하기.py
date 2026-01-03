import sys
input = sys.stdin.readline

t = int(input())
dp = [0 for _ in range(12)]

dp[1], dp[2], dp[3] = 1, 2, 4

for i in range(t):
    n = int(input())

    for j in range(4, n+1):
        if dp[j] == 0:
            dp[j] = dp[j-1] + dp[j-2] + dp[j-3]
    print(dp[n])