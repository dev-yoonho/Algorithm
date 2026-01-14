import sys
input = sys.stdin.readline

first_dict = {}
second_dict = {}

s1 = input().rstrip()
s2 = input().rstrip()

for i in s1:
    if i in first_dict:
        first_dict[i] += 1
    else:
        first_dict[i] = 1

for j in s2:
    if j in second_dict:
        second_dict[j] += 1
    else:
        second_dict[j] = 1
    
for k in s2:
    if k in first_dict and first_dict[k] != 0:
        first_dict[k] -= 1

for l in s1:
    if l in second_dict and second_dict[l] != 0:
        second_dict[l] -= 1

answer = 0
for cnt in first_dict.values():
    answer += cnt
for cnt in second_dict.values():
    answer += cnt

print(answer)