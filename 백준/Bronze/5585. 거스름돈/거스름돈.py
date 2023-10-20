import sys

remain = 1000 - int(sys.stdin.readline())
money, cnt = [500, 100, 50, 10, 5, 1], 0

for i in money:
    if remain >= i:
        cnt += remain // i
        remain = remain % i
print(cnt)