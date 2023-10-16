import sys

word = sys.stdin.readline().rstrip()
bomb = sys.stdin.readline().rstrip()

lenth = len(bomb)
stack = []

for s in word:
    stack.append(s)
    if ''.join(stack[-lenth:]) == bomb:
        for _ in range(lenth):
            stack.pop()
answer = "".join(stack)

if answer:
    print(answer)
else:
    print("FRULA")