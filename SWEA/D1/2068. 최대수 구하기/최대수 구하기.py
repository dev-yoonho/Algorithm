t = int(input())
for i in range(t):
    num_list = list(map(int, input().split()))
    print(f"#{i+1} {max(num_list)}")