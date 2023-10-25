import sys

x = int(sys.stdin.readline())
nums = sorted(list(map(int, sys.stdin.readline().split())))
print(nums[0] * nums[-1]) if len(nums) > 1 else print(nums[0] ** 2)