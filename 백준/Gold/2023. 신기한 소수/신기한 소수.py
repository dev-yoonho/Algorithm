import sys

def is_prime(num):
    if num <= 1:
        return False
    elif num <= 3:
        return True
    elif num % 2 == 0 or num % 3 == 0:
        return False
    x = 5
    while x * x <= num:
        if num % x == 0 or num % (x + 2) == 0:
            return False
        x += 6
    return True

def dfs(num):
    if len(str(num)) == n:
        print(num)
    else:
        for i in range(10):
            temp = 10 * num + i
            if is_prime(temp):
                dfs(temp)

n = int(sys.stdin.readline())
dfs(2)
dfs(3)
dfs(5)
dfs(7)