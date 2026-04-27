import sys

s = sys.stdin.readline().rstrip().upper()
manage_s = list(set(s))

cnt = []
for i in manage_s:
    cnt.append(s.count(i))
if cnt.count(max(cnt)) > 1:
    print("?")
else:
    print(manage_s[cnt.index(max(cnt))])