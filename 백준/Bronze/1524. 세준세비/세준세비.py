import sys

t = int(sys.stdin.readline())

for _ in range(t):
    sys.stdin.readline()
    n, m = map(int, sys.stdin.readline().split())
    power_sj = list(map(int, sys.stdin.readline().split()))
    power_sj.sort(reverse = True)
    power_sb = list(map(int, sys.stdin.readline().split()))
    power_sb.sort(reverse = True)

    while power_sj and power_sb:
        if power_sj[-1] >= power_sb[-1]:
            power_sb.pop()
        else:
            power_sj.pop()
    if power_sj:
        print("S")
    elif power_sb:
        print("B")
    else:
        print("C")