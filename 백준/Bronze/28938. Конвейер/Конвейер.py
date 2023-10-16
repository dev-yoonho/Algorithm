import sys

n = int(sys.stdin.readline())
m = sum(map(int, sys.stdin.readline().split()))

print("Right") if m > 0 else print("Stay") if m == 0 else print("Left")