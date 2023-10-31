import sys

n = int(sys.stdin.readline())

for _ in range(n):
    temp = ""
    s = sys.stdin.readline().rstrip()
    while s != "":
        temp += s
        s = sys.stdin.readline().rstrip()
    shap = temp.count("#")
    n = len(temp)
    rst = round((n - shap) / n * 100, 1)
    if str(rst).split(".")[-1] == "0":
        rst = int(rst)
    print(f"Efficiency ratio is {rst}%.")