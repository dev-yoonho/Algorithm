import sys
input = sys.stdin.readline

input()
n = list(map(int, input().split()))
print(min(n), max(n))