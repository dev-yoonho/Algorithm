import sys

def is_prime(num):
    if num <= 3:
        return True
    elif num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

k = int(sys.stdin.readline())
cnt = 0
i = 2
while 1:
    if is_prime(i):
        cnt += 1
    if cnt == k:
        print(i)
        break
    i += 1