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

n, k = map(int, sys.stdin.readline().split())
cnt = 0
temp = [i for i in range(2, n + 1)]
for j in range(2, n + 1):
    if is_prime(j):
        for l in range(j, n + 1, j):
            if l in temp:
                cnt += 1
                ans = temp.pop(temp.index(l))
            if cnt == k:
                print(ans)
                break