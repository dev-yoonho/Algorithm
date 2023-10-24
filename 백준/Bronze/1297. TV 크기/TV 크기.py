import sys

d, h, w = map(int, sys.stdin.readline().split())
r = ((d * d) / (h * h + w * w)) ** 0.5
print(int(h * r), int(w * r))