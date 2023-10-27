import sys

s = int(sys.stdin.readline())
temp, cnt = 0, 0
for i in range(1, s + 1):
    temp += i
    cnt += 1
    if temp > s:
        cnt -= 1
        break
    elif temp == s:
        break
print(cnt) if cnt != 1 else print(1)