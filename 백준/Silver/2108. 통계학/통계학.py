import sys
input = sys.stdin.readline

n = int(input())
nums = []
for _ in range(n):
    nums.append(int(input()))

# 산술평균
avg = 0
for i in range(n):
    avg += (nums[i] / n)
print(round(avg))

# 중앙값
nums.sort()
mid = nums[n//2]
print(mid)

# 최빈값
cnt_dict = {}

for num in nums:
    if num in cnt_dict:
        cnt_dict[num] += 1
    else:
        cnt_dict[num] = 1

max_freq = max(cnt_dict.values()) # 가장 많이 나온 빈도 탐색
max_ns = sorted([i for i, j in cnt_dict.items() if j == max_freq])

if len(max_ns) == 1:
    print(max_ns[0])
else:
    print(max_ns[1])


# 범위
n_range = nums[-1] - nums[0]
print(n_range)