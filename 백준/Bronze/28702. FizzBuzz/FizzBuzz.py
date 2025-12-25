import sys
input = sys.stdin.readline

flag = 0
answer = 0
for i in range(3):
    number = input().rstrip()
    if number.isnumeric():
        flag = i
        answer = int(number)

answer += (3-flag)

if (answer % 3 == 0) and (answer % 5 == 0):
    print("FizzBuzz")
elif (answer % 3 != 0) and (answer % 5 != 0):
    print(answer)
elif (answer % 3 == 0) and (answer % 5 != 0):
    print("Fizz")
else:
    print("Buzz")