import sys
input = sys.stdin.readline

a, b = map(int, input().split())
c = int(input())

money = a + b
chicken = c * 2

if money >= chicken:
    print(money - chicken)
else:
    print(money)