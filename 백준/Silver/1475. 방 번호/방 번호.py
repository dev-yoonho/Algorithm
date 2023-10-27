import sys

arr = [0] * 10
n = [int(i) for i in sys.stdin.readline().rstrip()]
for j in n:
    if j != 6 and j != 9:
        arr[j] += 1
    else:
        if arr[6] <= arr[9]:
            arr[6] += 1
        else:
            arr[9] += 1
print(max(arr))