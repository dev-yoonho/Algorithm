import sys

one = sys.stdin.readline()
two = sys.stdin.readline()
temp = ""

for i in range(8):
    temp += (one[i] + two[i])

result = ""
itr = 16
while itr > 2:
    temp_2 = result
    for j in range(0, itr - 1):
        temp_2 += str(int(temp[j]) + int(temp[j+1]))[-1]

    temp = temp_2
    itr -= 1

print(temp)