import sys
input = sys.stdin.readline

nums = list(map(int, input().split()))

print(sum([i*5 for i in nums]))