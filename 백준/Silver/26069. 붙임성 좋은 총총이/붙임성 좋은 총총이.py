import sys
input = sys.stdin.readline

n = int(input())
dancing = set(['ChongChong']) # 춤을 추는 사람을 만나면 해당 집합에 들어가게 됨

for _ in range(n):
    a, b = input().rstrip().split()
    if a in dancing:
        dancing.add(b)
    elif b in dancing:
        dancing.add(a)
    else:
        continue

print(len(dancing))