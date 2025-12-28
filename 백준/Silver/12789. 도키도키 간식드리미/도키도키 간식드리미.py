import sys
input = sys.stdin.readline

n = int(input())
ticket = list(map(int, input().split()))
waiting = []
flag = 1

# 현재 줄 서있는 곳(ticket)은 큐
# 한명씩만 설 수 있는 공간(waiting)은 스택

for human in ticket:
    if human == flag: # 지금 들어갈 수 있으면
        flag += 1
    else: # 지금 못 들어가면
        waiting.append(human) # 대기열에 추가

    while waiting and waiting[-1] == flag:
        waiting.pop()
        flag += 1

if waiting:
    print("Sad")
else:
    print("Nice")