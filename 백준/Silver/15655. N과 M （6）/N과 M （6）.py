import sys
input = sys.stdin.readline

def backtrack(start):
    if len(result) == m:
        print(*result)
        return

    for i in range(start, n):
        result.append(nums[i])

        backtrack(i+1)

        result.pop()


n, m = map(int, input().split())
nums = list(map(int, input().split()))
nums.sort()

result = []

backtrack(0)