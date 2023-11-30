import sys

def is_not_prime(x):
    if x <= 1:
        return True
    elif x <= 3:
        return False
    elif x % 2 == 0 or x % 3 == 0:
        return True
    i = 5
    while i * i <= x:
        if x % i == 0 or x % (i + 2) == 0:
            return True
        i += 6
    return False

n = int(sys.stdin.readline())
while 1:
    if is_not_prime(n):
        print(n)
        break
    n += 1