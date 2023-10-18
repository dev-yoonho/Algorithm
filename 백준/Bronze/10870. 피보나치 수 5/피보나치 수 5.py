import sys

n = int(sys.stdin.readline())
fibo, i = [0, 1], -1
while len(fibo) < n + 1:
    fibo.append(fibo[1+i] + fibo[2+i])
    i += 1
print(fibo[n])