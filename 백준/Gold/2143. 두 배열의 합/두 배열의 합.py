import sys
from collections import Counter

input = sys.stdin.readline

T = int(input())

n = int(input())
A = list(map(int, input().split()))

m = int(input())
B = list(map(int, input().split()))


def get_sub_sums(arr):
    result = []

    for i in range(len(arr)):
        total = 0

        for j in range(i, len(arr)):
            total += arr[j]
            result.append(total)

    return result


a_sums = get_sub_sums(A)
b_sums = get_sub_sums(B)

b_counter = Counter(b_sums)

answer = 0

for a in a_sums:
    answer += b_counter[T - a]

print(answer)