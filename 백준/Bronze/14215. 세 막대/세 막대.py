import sys

temp = sorted(list(map(int, sys.stdin.readline().split())))
a, b, c = temp
if a == b == c:
    print(a * 3)
elif a + b > c:
    print(sum(temp))
else:
    print(a * 2 + b * 2 - 1)