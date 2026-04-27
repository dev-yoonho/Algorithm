import sys

input = sys.stdin.readline

n, d = map(int, input().split())

foods = []

for _ in range(n):
    t, a, b = map(int, input().split())
    foods.append((t, a, b))

# 시간 짧은 순서대로 정렬
foods.sort()

times = []
max_a = []
max_b = []
max_ab = []

cur_a = 0
cur_b = 0
cur_ab = 0

for t, a, b in foods:
    times.append(t)

    cur_a = max(cur_a, a)
    cur_b = max(cur_b, b)
    cur_ab = max(cur_ab, a + b)

    max_a.append(cur_a)
    max_b.append(cur_b)
    max_ab.append(cur_ab)


answer = 0

for t, a, b in foods:
    # 이 요리 하나만 만드는 경우
    answer = max(answer, a + b)

    remain = d - t

    # remain 이하의 시간이 걸리는 요리들 중 마지막 위치 찾기
    idx = -1

    left = 0
    right = n - 1

    while left <= right:
        mid = (left + right) // 2

        if times[mid] <= remain:
            idx = mid
            left = mid + 1
        else:
            right = mid - 1

    if idx == -1:
        continue

    # 현재 요리 + 같이 만들 수 있는 요리 하나를 고르는 경우
    answer = max(answer, max_a[idx] + b)
    answer = max(answer, a + max_b[idx])
    answer = max(answer, max_ab[idx])

print(answer)