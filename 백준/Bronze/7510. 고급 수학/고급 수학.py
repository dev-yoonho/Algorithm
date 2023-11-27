import sys

t = int(sys.stdin.readline())
for i in range(t):
    a, b, c = sorted(list(map(int, sys.stdin.readline().split())))
    if c ** 2 == a ** 2 + b ** 2:
        print(f"Scenario #{i + 1}:\nyes\n")
    else:
        print(f"Scenario #{i + 1}:\nno\n")