import sys
from collections import deque

input = sys.stdin.readline


n, m = map(int, input().split())

queue = deque([i for i in range(n)])

nums = list(map(int, input().split()))
nums = [i - 1 for i in nums]

count = 0
while nums:
    # print(f"queue[0] : {queue[0]} nums[0]: {nums[0]}")
    
    if queue[0] == nums[0]:
        _ = nums.pop(0)
        queue.popleft()
    
    else:
        present_idx = queue.index(nums[0])
        length = len(queue)
        diff = length - present_idx
    

        if present_idx < diff:
            count += present_idx
            queue.rotate(-1 * present_idx)
        else:
            count += diff
            queue.rotate(diff)

    # print(f"큐: {queue} 빼야하는 거: {nums} 카운트: {count}")

print(count)