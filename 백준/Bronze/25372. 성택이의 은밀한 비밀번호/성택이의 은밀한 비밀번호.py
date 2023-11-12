import sys

n = int(sys.stdin.readline())
for _ in range(n):
    if 6 <= len(sys.stdin.readline().rstrip()) <= 9:
        print("yes")
    else:
        print("no")