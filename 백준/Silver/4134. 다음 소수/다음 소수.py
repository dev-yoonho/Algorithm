import sys

def is_prime(n):
    if n <= 1:
        return False
    elif n <= 3:
        return True
    elif n % 2 == 0 or n % 3 == 0:
        return False
    i = 5
    while i * i <= n:
        if n % i == 0 or n % (i + 2) == 0:
            return False
        i += 6
    return True

t = int(sys.stdin.readline())
for _ in range(t):
    n = int(sys.stdin.readline())
    if n <= 2:
        print(2)
    else:
        if n % 2 == 0:
            n += 1
        while not is_prime(n):
            n += 2
        print(n)