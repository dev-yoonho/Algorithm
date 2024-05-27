def cal_num(x):
    N_list = [2, 3, 5, 7, 11]
    result = []
    for i in N_list:
        cnt = 0
        while x % i == 0:
            x //= i
            cnt += 1
        result.append(cnt)
    return result
            

T = int(input())

for j in range(T):
    num = int(input())
    temp = cal_num(num)
    print(f"#{j+1} ", end = "")
    print(*temp)