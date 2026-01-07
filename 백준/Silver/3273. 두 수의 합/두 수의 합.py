import sys
input = sys.stdin.readline

n = int(input())
nums = list(map(int, input().split()))
x = int(input())

nums.sort()

start = 0
end = n - 1

result = 0
while start < end:
    tmp = nums[start] + nums[end]

    if tmp < x:
        start += 1
    elif tmp > x:
        end -= 1
    else:
        result += 1
        start += 1
        end -= 1

print(result)