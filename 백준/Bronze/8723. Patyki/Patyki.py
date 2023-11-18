import sys

a, b, c = map(int, sys.stdin.readline().split())
temp = [a, b, c]
a = temp.pop(temp.index(max(temp)))

if a >= sum(temp) or (a ** 2 != temp[0] ** 2 + temp[1] ** 2 and not (a == b == c)):
    print(0)
elif a ** 2 == temp[0] ** 2 + temp[1] ** 2 and not (a == b == c):
    print(1)
elif a ** 2 != temp[0] ** 2 + temp[1] ** 2 and a == b == c:
    print(2)