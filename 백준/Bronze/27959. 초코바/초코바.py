import sys

n, m = map(int, sys.stdin.readline().split())
print("Yes") if n * 100 >= m else print("No") 