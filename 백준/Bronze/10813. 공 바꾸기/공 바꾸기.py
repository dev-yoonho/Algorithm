import sys

n, m = map(int, sys.stdin.readline().split())
answer = [i for i in range(1, n + 1)]
for _ in range(m):
    a, b = map(int, sys.stdin.readline().split())
    answer[a - 1], answer[b - 1] = answer[b - 1], answer[a - 1]
print(*answer)
