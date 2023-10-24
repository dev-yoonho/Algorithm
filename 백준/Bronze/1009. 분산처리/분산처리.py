import sys

t = int(sys.stdin.readline())
for _ in range(t):
    a, b = map(int, sys.stdin.readline().split())
    a = a % 10
    if a == 0:
        print(10)
    elif a in [1, 5, 6]:
        print(a)
    elif a in [4, 9]:
        b %= 2
        if b == 1:
            print(a)
        else:
            print((a * a) % 10)
    else:
        b %= 4
        if b == 0:
            print((a ** 4) % 10)
        else:
            print((a ** b) % 10)