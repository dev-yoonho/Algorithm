import sys

input = sys.stdin.readline

n = int(input().rstrip())

for _ in range(n):
    voca = input().rstrip()
    
    sum = 0
    for i in ["a", "e", "i", "o", "u"]:
        sum += voca.count(i)
    
    print(f"The number of vowels in {voca} is {sum}.")