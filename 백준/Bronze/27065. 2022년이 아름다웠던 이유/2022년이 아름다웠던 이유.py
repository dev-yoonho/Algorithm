import sys

t = int(sys.stdin.readline())
for _ in range(t):
    n = int(sys.stdin.readline())
    temp = [1]
    for i in range(2, int(pow(n, 0.5)) + 1):
        if i * i == n:
            temp.append(i)
        elif n % i == 0:
            temp.append(n // i)
            temp.append(i)
    if sum(temp) <= n:
        print("BOJ 2022")
    else:
        ans = []
        for j in temp:
            temp_2 = [1]
            for k in range(2, int(pow(j, 0.5)) + 1):
                if k * k == j:
                    temp_2.append(k)
                elif j % k == 0:
                    temp_2.append(j // k)
                    temp_2.append(k)
            if sum(temp_2) > j:
                ans.append(1)
        print("BOJ 2022") if 1 in ans else print("Good Bye")