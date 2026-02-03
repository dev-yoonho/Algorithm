import sys
from collections import deque

input = sys.stdin.readline

s = input().rstrip()

while s != "EOI":
    if "nemo" in s.lower():
        print("Found")
    else:
        print("Missing")

    s = input().rstrip()