import sys

s = sys.stdin.readline().rstrip()

while s != "END":
    print(s[::-1])
    s = sys.stdin.readline().rstrip()