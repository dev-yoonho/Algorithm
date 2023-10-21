import sys

n = sys.stdin.readline().rstrip()
if n[1] == '0':
    print(10 + int(n[2:]))
else:
    print(int(n[0]) + int(n[1:]))