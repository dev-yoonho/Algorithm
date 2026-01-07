import sys
input = sys.stdin.readline

n = int(input())
m = int(input())
nums = list(map(int, input().split()))

nums.sort()

start = 0
end = n - 1

answer = 0
while start < end:
    tmp = nums[start] + nums[end]

    if tmp < m:
        start += 1
    elif tmp > m:
        end -= 1
    else:
        answer += 1
        start += 1
        end -= 1

print(answer)