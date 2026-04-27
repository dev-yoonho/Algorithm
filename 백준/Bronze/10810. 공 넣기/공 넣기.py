import sys

n, m = map(int, sys.stdin.readline().split())
answer = [0] * n
for _ in range(m):
    i, j, k = map(int, sys.stdin.readline().split())
    for l in range(i, j + 1):
        answer[l-1] = k
print(*answer)
