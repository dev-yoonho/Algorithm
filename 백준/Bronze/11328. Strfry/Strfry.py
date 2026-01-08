import sys
input = sys.stdin.readline

t = int(input())

for _ in range(t):
     a, b = map(list, input().split())

     a.sort()
     b.sort()

     print("Possible") if a == b else print("Impossible")