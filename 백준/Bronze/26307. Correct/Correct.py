import sys
input = sys.stdin.readline

h, m = map(int, input().split())

print((h-9) * 60 + m)