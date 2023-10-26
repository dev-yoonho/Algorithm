import sys

print(int(str(sum([int(i[::-1]) for i in list(map(str, sys.stdin.readline().split()))]))[::-1]))