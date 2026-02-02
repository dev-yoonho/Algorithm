import sys
input = sys.stdin.readline

running_time = sum([int(input()) for _ in range(4)]) + 300

if running_time > 1800:
    print("No")
else:
    print("Yes")