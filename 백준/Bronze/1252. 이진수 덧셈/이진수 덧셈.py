import sys

n, m = map(str, sys.stdin.readline().split())
temp = ['0b' + n, '0b' + m]
print(bin(sum([int(i, 2) for i in temp]))[2:])