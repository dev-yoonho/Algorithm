import sys

input = sys.stdin.readline

N, M = map(int, input().split())
nums = list(map(int, input().split()))

nums.sort()

result = []
answer = []

def dfs(depth):
    if depth == M:
        answer.append(' '.join(map(str, result)))
        return

    for num in nums:
        result.append(num)
        dfs(depth + 1)
        result.pop()

dfs(0)

print('\n'.join(answer))