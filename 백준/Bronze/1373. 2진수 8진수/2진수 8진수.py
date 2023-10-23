import sys

n = "0b" + sys.stdin.readline().rstrip()
print(oct(int(n, 2))[2:])