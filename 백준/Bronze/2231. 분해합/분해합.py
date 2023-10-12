import sys

n = int(sys.stdin.readline())
temp = [x for x in range(n-1, 0, -1) if x + sum([int(i) for i in str(x)]) == n]
if temp:
    print(min(temp))
else:
    print(0)