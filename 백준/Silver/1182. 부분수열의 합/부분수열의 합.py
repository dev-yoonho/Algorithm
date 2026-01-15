import sys
input = sys.stdin.readline

def backtrack(start):
    global count, s
    
    if len(result) == length and sum(result) == s:
        count += 1
        return

    for i in range(start, n):
        result.append(nums[i])

        backtrack(i+1)

        result.pop()

n, s = map(int, input().split())
nums = list(map(int, input().split()))

count = 0

for length in range(1, n+1):
    result = []

    backtrack(0)

print(count)