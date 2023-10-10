import sys
s = sys.stdin.readline().rstrip()
arr = set()
for i in range(len(s) + 1):
    for j in range(i, len(s) + 1):
        arr.add(s[i:j])
print(len(arr) - 1)