t = int(input())
for test_case in range(1, t+1):
    print(f"#{test_case} {sum([i for i in map(int, input().split()) if i%2 != 0])}")