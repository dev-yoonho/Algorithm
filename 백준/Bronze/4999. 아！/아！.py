import sys

jh = sys.stdin.readline().rstrip()
doctor = sys.stdin.readline().rstrip()

print("go") if len(jh) >= len(doctor) else print("no")