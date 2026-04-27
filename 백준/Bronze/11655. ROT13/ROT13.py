import sys
import string

s = sys.stdin.readline().rstrip()
spell = list(string.ascii_uppercase) * 2 + list(string.ascii_lowercase) * 2

temp = "".join([i if i == " " or str(i).isdigit() else spell[spell.index(i) + 13] for i in s])
print(temp)