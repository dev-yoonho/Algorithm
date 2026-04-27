import sys

input = sys.stdin.readline

n = int(input())
meeting = [list(map(int, input().split())) for _ in range(n)]

meeting.sort(key = lambda x: (x[1], x[0]))

end = 0
answer = 0

for i in meeting:
    if i[0] >= end:
        answer += 1
        end = i[1]

print(answer)