import sys

n = int(sys.stdin.readline())
f = int(sys.stdin.readline())
n = int(str(n)[:-2]) * 100
while True:
    if n % f == 0:
        answer = n
        break
    n += 1

print(str(answer)[-2:])