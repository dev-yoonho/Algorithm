import sys
input = sys.stdin.readline

s1 = input().rstrip()
s2 = input().rstrip()

count = [0] * 26

for c in s1:
    count[ord(c) - 97] += 1

for c in s2:
    count[ord(c) - 97] -= 1

print(sum([abs(i) for i in count]))