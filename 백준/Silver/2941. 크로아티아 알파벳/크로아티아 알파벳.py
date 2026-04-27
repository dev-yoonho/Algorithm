import sys

croa = ["c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="]
word = sys.stdin.readline().rstrip()
for i in croa:
        word = word.replace(i, "0")
print(len(word))