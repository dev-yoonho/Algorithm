import sys

t = int(sys.stdin.readline())

for _ in range(t):
    floor = int(sys.stdin.readline())
    num = int(sys.stdin.readline())
    f_0 = [i for i in range(1, num + 1)]
    for j in range(floor):
        for k in range(1, num):
            f_0[k] += f_0[k - 1]
    print(f_0[-1])