import sys
input = sys.stdin.readline

def calculate(result):
    total = nums[0]

    for i in range(length):
        next_num = nums[i+1]
        op = result[i]

        if op == "+":
            total += next_num
        elif op == "-":
            total -= next_num
        elif op == "*":
            total *= next_num
        else:
            total = int(total / next_num)

    return total

def backtrack():
    if len(result) == length:
        answer.append(calculate(result))
        return

    for i in range(0, length):
        if not visited[i]:
            visited[i] = True
            result.append(calculs[i])

            backtrack()

            result.pop()
            visited[i] = False
        

n = int(input())
nums = list(map(int, input().split()))
temp = list(map(int, input().split()))
calculs = (temp[0] * "+") + (temp[1] * "-") + (temp[2] * "*") + (temp[3] * "/")
calculs = [i for i in calculs]

length = n-1
visited = [False] * length
result = []

answer = []

backtrack()

print(max(answer))
print(min(answer))
