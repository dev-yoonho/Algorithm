t = int(input())
for test_case in range(1, t+1):
    print(f"#{test_case} {round(sum(map(int, input().split())) / 10)}")