import sys

n = sys.stdin.readline().rstrip()
answer = 0
for i in range(1, len(n)):
    rst1, rst2 = 1, 1
    for j in n[:i]:
        rst1 *= int(j)
    for k in n[i:]:
        rst2 *= int(k)
    if rst1 == rst2:
        answer += 1
print("YES") if answer else print("NO")