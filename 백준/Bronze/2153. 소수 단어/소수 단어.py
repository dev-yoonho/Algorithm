import sys
import string

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

temp = list(string.ascii_lowercase) + list(string.ascii_uppercase)
num = sum([temp.index(i) + 1 for i in sys.stdin.readline().rstrip()])
print("It is a prime word.") if is_prime(num) else print("It is not a prime word.")