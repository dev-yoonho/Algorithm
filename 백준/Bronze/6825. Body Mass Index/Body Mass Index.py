import sys

input = sys.stdin.readline

w = float(input())
h = float(input())

BMI = w / (h * h)

if BMI > 25:
    print("Overweight")
elif BMI >= 18.5 :
    print("Normal weight")
else:
    print("Underweight")