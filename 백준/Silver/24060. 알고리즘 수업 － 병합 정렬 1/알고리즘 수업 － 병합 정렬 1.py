import sys
input = sys.stdin.readline
sys.setrecursionlimit(10**6)

# 반으로 쪼개서 정렬하고 합치기 반복 → 병합 정렬
# 배열의 크기 n,  저장횟수 k, 배열 이름 nums

n, k = map(int, input().split())
nums = list(map(int, input().split()))

cnt = 0
check = k
answer = -1

def merge_sort(num_list, start, end):
    if start < end:
        mid = (start+end) // 2
        merge_sort(num_list, start, mid)
        merge_sort(num_list, mid + 1, end)
        merge(num_list, start, mid, end)

def merge(num_list, start, mid, end):
    global cnt, check, answer
    
    i = start
    j = mid + 1
    tmp = []

    while (i <= mid) and (j <= end):
        if num_list[i] <= num_list[j]:
            tmp.append(num_list[i])
            i += 1
        else:
            tmp.append(num_list[j])
            j += 1

    while i <= mid:
        tmp.append(num_list[i])
        i += 1

    while j <= end:
        tmp.append(num_list[j])
        j += 1

    for t in range(len(tmp)):
        num_list[start + t] = tmp[t]
        cnt += 1
        if cnt == check:
            answer = tmp[t]

merge_sort(nums, 0, len(nums)-1)

print(answer)