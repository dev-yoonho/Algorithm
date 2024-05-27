T = int(input())

for i in range(T):
    answer = 0
    num = int(input())
    for j in range(1, num + 1, 2):
        answer += j
    for k in range(2, num + 1, 2):
        answer -= k
    print(f"#{i+1} {answer}")