import sys

om = {'black': 1, 'brown': 10, 'red': 100, 'orange': 1000, 'yellow': 10000, 'green': 100000, 'blue': 1000000, 'violet': 10000000, 'grey': 100000000, 'white': 1000000000}

one = sys.stdin.readline().rstrip()
two = sys.stdin.readline().rstrip()
thr = sys.stdin.readline().rstrip()
x = list(om.keys())
print(int(str(x.index(one)) + str(x.index(two))) * om[thr])