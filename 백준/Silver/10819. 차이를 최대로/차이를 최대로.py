import sys
input = sys.stdin.readline

def backtrack():
    global max_num
    
    if len(result) == n:
        temp = 0
        for i in range(n-1):
            temp += abs(result[i] - result[i+1])
        max_num = max(temp, max_num)
        return

    for j in range(n):
        if not visited[j]:
            visited[j] = True
            result.append(nums[j])

            backtrack()

            result.pop()
            visited[j] = False


n = int(input())
nums = list(map(int, input().split()))

visited = [False] * n
result = []
max_num = 0

backtrack()

print(max_num)