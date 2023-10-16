import sys

n = sys.stdin.readline().rstrip()
print("".join([i.upper() if i.islower() else i.lower() for i in n]))