import sys

n, k = [int(sys.stdin.readline()) for _ in range(2)]
cnt = 1
for i in range(2, n + 1):
    d = 2
    while d <= k:
        if i % d == 0:
            i //= d
        else:
            d += 1
    if i == 1:
        cnt += 1
print(cnt)