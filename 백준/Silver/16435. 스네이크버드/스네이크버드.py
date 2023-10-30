import sys

n, l = map(int, sys.stdin.readline().split())
fruit = sorted(list(map(int, sys.stdin.readline().split())))
for i in fruit:
    if i > l:
        break
    else:
        l += 1
print(l)