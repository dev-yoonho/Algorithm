import sys

k = int(sys.stdin.readline())

cnt_a, cnt_b = 1, 0

for _ in range(k):
    n_cnt_a = cnt_b
    n_cnt_b = cnt_a + cnt_b
    cnt_a = n_cnt_a
    cnt_b = n_cnt_b

print(f"{cnt_a} {cnt_b}")