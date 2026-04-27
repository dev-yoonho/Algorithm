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

n = int(sys.stdin.readline())
a = [i for i in list(map(int, sys.stdin.readline().split())) if is_prime(i)]
if not a:
    print(-1)
else:
    a = list(set(a))
    ans = 1
    for j in a:
        ans *= j
    print(ans)