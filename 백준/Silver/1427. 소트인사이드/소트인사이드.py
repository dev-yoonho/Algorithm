import sys

print(int("".join(sorted([i for i in sys.stdin.readline().rstrip()], reverse = True))))