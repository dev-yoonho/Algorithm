import sys

def is_prime(num):
    if num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

n, m = map(str, sys.stdin.readline().rstrip().split())
n, m = int(n), int(m + n)
print("Yes") if is_prime(n) and is_prime(m) else print("No")