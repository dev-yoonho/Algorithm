import sys

def d(x, y):
    return abs(y[0] - x[0]) ** 2 + abs(y[1] - x[1]) ** 2

t = int(sys.stdin.readline())
temp = []
for _ in range(t):
    temp = sorted([list(map(int, sys.stdin.readline().split())) for _ in range(4)])
    if temp == [[0, 0]] * 4:
        print(0)
    elif d(temp[0], temp[1]) == d(temp[0], temp[2]) and d(temp[1], temp[2]) == d(temp[0], temp[3]):
        print(1)
    else:
        print(0)