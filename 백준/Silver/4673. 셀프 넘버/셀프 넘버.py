num = set(range(1, 10001))
non_self_num = set()

for i in range(1, 10001):
    for j in str(i):
        i += int(j)
    non_self_num.add(i)

self_num = sorted(num - non_self_num)
for k in self_num:
    print(k)