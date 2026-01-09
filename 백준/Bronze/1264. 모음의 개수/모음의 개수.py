import sys
input = sys.stdin.readline

moeum = ["a", "e", "i", "o", "u"]

s = input().rstrip()
while s != "#":
    s = s.lower()

    answer = 0

    for i in moeum:
        if s.count(i) > 0:
            answer += s.count(i)

    print(answer)

    s = input().rstrip()