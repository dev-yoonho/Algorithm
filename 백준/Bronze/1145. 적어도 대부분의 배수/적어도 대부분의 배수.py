import sys

num = list(map(int, sys.stdin.readline().split()))
start = min(num)
while True:
    cnt = 0
    for i in range(len(num)):
        if start % num[i] == 0:
            cnt += 1
    if cnt > 2:
        print(start)
        break
    start += 1