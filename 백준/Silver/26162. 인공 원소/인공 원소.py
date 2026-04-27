import sys

def is_prime(num):
    if num <= 1:
        return False
    elif num <= 3:
        return True
    elif num % 2 == 0 or num % 3 == 0:
        return False
    i = 5
    while i * i <= num:
        if num % i == 0 or num % (i + 2) == 0:
            return False
        i += 6
    return True

def check(num):
    global i
    for k in num:
        for l in num:
            if l + k == i:
                return True
    return False

n = int(sys.stdin.readline())
a = [int(sys.stdin.readline()) for _ in range(n)]
for i in a:
    box = [j for j in range(i) if is_prime(j)]
    print("Yes") if check(box) else print("No")