import sys
input = sys.stdin.readline

t = int(input())
for _ in range(t):
    r = input()
    a = 0

    for i in range(len(r)):
        for j in range(i, -1, -1):
            if r[j] == "O":
                a += 1
            else: break
    print(a)