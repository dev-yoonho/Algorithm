import sys
input = sys.stdin.readline

count = 0
while True:
    s = input().rstrip()

    # 입력이 없으면(EOF) 루프 종료
    if not s:
        break

    if s == "gum gum for jay jay":
        count += 1

print(count)