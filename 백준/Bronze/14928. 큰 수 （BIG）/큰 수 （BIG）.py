import sys
input = sys.stdin.readline

n = input().rstrip()
s = 20000303

remind = 0
for digit in n:
    remind = (remind * 10 + int(digit)) % s

print(remind)