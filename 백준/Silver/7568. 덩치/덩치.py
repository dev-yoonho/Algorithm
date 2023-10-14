import sys

n = int(sys.stdin.readline())
temp, rank = [], []

for _ in range(n):
    x, y = map(int, sys.stdin.readline().split())
    temp.append([x, y])
for i in temp:
    cnt = 0
    for j in temp:
        if j[0] > i[0] and j[1] > i[1]:
            cnt += 1
    rank.append(cnt + 1)
print(*rank)