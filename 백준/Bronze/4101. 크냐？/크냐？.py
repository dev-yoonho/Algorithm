import sys

n, m = map(int, sys.stdin.readline().split())

while not(n == 0 and m == 0):
    print("Yes") if n > m else print("No")
    n, m = map(int, sys.stdin.readline().split())