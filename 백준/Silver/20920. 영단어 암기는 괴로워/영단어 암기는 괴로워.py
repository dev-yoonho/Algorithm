import sys
input = sys.stdin.readline

n, m = map(int, input().split())

voc_list = []
for i in range(n):
    voc = input().rstrip()
    if len(voc) >= m:
        voc_list.append(voc)

cnt_dict = {}
for voc in voc_list:
    if voc in cnt_dict:
        cnt_dict[voc] += 1
    else:
        cnt_dict[voc] = 1

voc_set = list(set(voc_list))

voc_set = sorted(voc_set, key=lambda x : (-cnt_dict[x], -len(x), x))

for v in voc_set:
    print(v)