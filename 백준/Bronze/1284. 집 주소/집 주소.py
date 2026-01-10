import sys
input = sys.stdin.readline

numsize = [4, 2, 3, 3, 3, 3, 3, 3, 3, 3]

num = input().rstrip()
while num != "0":
    answer = len(num) + 1

    for i in num:
        answer += numsize[int(i)]
    print(answer)

    num = input().rstrip()