import sys

n = int(sys.stdin.readline())
answer = []

for i in range(1, n + 1):
    i_list = [int(j) for j in str(i)]
    temp = []
    if len(i_list) <= 2:
        answer.append(i)
        continue
    for k in range(1, len(i_list)):
        temp.append((i_list[k] - i_list[k - 1]))
    if len(set(temp)) == 1:
        answer.append(i)

print(len(answer))