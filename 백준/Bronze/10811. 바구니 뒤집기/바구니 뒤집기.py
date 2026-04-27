import sys

n, m = map(int, sys.stdin.readline().split())
answer = [i for i in range(1, n + 1)]
for _ in range(m):
    i, j = map(int, sys.stdin.readline().split())
    temp = answer[i - 1: j]
    temp.reverse()
    answer[i - 1:j] = temp
print(*answer)