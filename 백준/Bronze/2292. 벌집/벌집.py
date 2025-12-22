import sys
input = sys.stdin.readline

n = int(input())
p, cnt = 1, 1
while n > p:
    p += 6*cnt
    cnt += 1
print(cnt)