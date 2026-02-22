import sys

input = sys.stdin.readline

n = int(input())

ingr = list(input().split())
use = list(input().split())

sub_set = [x for x in ingr if x not in use]

print(*sub_set)