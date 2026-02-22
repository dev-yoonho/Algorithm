import sys

input = sys.stdin.readline

h = int(input())
w = int(input())

short_side = min(h, w)
radius_cm = (short_side * 100) // 2

print(radius_cm)