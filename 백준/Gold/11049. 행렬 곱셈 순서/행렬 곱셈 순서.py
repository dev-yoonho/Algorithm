import sys

input = sys.stdin.readline

n = int(input())
matrix = [list(map(int, input().split())) for _ in range(n)]

dp = [[0] * n for _ in range(n)]

for length in range(2, n + 1):          # 구간 길이
    for i in range(n - length + 1):     # 시작점
        j = i + length - 1              # 끝점

        dp[i][j] = float('inf')

        for k in range(i, j):           # 나누는 위치
            cost = (
                dp[i][k]
                + dp[k + 1][j]
                + matrix[i][0] * matrix[k][1] * matrix[j][1]
            )

            dp[i][j] = min(dp[i][j], cost)

print(dp[0][n - 1])