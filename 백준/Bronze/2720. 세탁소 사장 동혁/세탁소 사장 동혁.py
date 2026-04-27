import sys

t = int(sys.stdin.readline())
for _ in range(t):
    c = int(sys.stdin.readline())
    temp = []
    temp.append(c // 25)
    c %= 25
    temp.append(c // 10)
    c %= 10
    temp.append(c // 5)
    c %= 5
    temp.append(c // 1)
    print(*temp)
