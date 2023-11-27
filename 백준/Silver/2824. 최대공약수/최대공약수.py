import sys

sys.stdin.readline()
a = list(map(int, sys.stdin.readline().split()))
temp = 1
for i in a:
    temp *= i
a = temp
sys.stdin.readline()
b = list(map(int, sys.stdin.readline().split()))
temp = 1
for i in b:
    temp *= i
b = temp

if a < b:
    a, b = b, a

while b != 0:
    a, b = b, a % b

print(str(a)[-9:])