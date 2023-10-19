import sys

n = int(sys.stdin.readline())
answer, cnt, stk, temp = [], 1, [], True

for _ in range(n):
    num = int(sys.stdin.readline())
    while cnt <= num:
        stk.append(cnt)
        answer.append("+")
        cnt += 1

    if stk[-1] == num:
        stk.pop()
        answer.append("-")
    else:
        temp = not temp
        break

if temp:
    for i in answer:
        print(i)
else:
    print("NO")