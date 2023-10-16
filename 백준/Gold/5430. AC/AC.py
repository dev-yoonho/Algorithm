import sys
from collections import deque

t = int(sys.stdin.readline())

for _ in range(t):
    p = sys.stdin.readline().rstrip()
    n = int(sys.stdin.readline())
    number = deque(sys.stdin.readline().rstrip()[1:-1].split(","))

    reverse, flag = 0, 0
    if n == 0:
        number = deque()

    for i in p:
        if i == "R":
            reverse += 1
        elif i == "D":
            if len(number) < 1:
                print("error")
                flag = 1
                break
            else:
                if reverse % 2 == 0:
                    number.popleft()
                else:
                    number.pop()

    if flag == 0:
        if reverse % 2 == 0:
            print("[" + ",".join(number) + "]")
        else:
            number.reverse()
            print("[" + ",".join(number) + "]")