import sys

n, m = map(int, sys.stdin.readline().split())
arr = [list(map(int, sys.stdin.readline().split())) for _ in range(n)]
k = int(sys.stdin.readline())
for _ in range(k):
    i, j, x, y = map(int, sys.stdin.readline().split())
    answer = 0
    for a in range(i - 1, x):
        for b in range(j -1 , y):
            answer += arr[a][b]
    print(answer)