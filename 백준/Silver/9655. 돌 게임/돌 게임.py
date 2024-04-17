import sys

n = int(sys.stdin.readline())

if n%4 == 1 or n%4 == 3:
    print("SK")
else:
    print("CY")