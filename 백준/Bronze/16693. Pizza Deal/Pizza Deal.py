import sys
import math

input = sys.stdin.readline

line1 = input().split()
a1, p1 = map(int, line1)

line2 = input().split()
r1, p2 = map(int, line2)

slice_deal = a1 / p1
whole_deal = (math.pi * (r1 ** 2)) / p2

if whole_deal > slice_deal:
    print("Whole pizza")
else:
    print("Slice of pizza")