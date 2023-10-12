import sys

n = int(sys.stdin.readline())
t = []
for _ in range(n):
    t.append(int(sys.stdin.readline()))
for i in sorted(t):
    sys.stdout.write(str(i)+'\n')