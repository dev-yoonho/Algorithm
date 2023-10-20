import sys

n = int(sys.stdin.readline())
a = list(map(int, sys.stdin.readline().split()))
b, c =  map(int, sys.stdin.readline().split())
cnt = n

for i in a:
    i -= b
    if i > 0:
        if i % c == 0:
            cnt += i // c
        else:
            cnt += (i // c) + 1
    
print(cnt)