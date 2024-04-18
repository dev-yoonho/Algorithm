import sys

n = int(sys.stdin.readline())

result = 0

if n % 5 == 0:
    result = n // 5
else:
    while 1:
        n -= 2
        result += 1
        if n < 0:
            result = -1
            break
        if n % 5 == 0:
            result += n // 5
            break
print(result)