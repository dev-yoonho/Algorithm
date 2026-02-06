import sys

input = sys.stdin.readline

n = int(input())
c = int(input())
p = int(input())

if n > c*p:
    print("no")
else:
    print("yes")