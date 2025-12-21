import sys

s = sys.stdin.readline().rstrip()
answer = []
for i in range(97, 123):
    if chr(i) in s:
        answer.append(s.index(chr(i)))
    else:
        answer.append(-1)
print(*answer)