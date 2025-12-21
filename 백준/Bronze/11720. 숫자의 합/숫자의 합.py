import sys

n = int(sys.stdin.readline())
s = sys.stdin.readline().rstrip()
print(sum([int(i) for i in s]))