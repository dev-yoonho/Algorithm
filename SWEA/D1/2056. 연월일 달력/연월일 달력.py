date = {"01": 31, "02": 28, "03": 31, "04": 30, "05": 30, "06": 30, "07": 30, "08": 30, "09": 30, "10": 30, "11": 30, "12": 30}
t = int(input())
for i in range(t):
    year = input()
    if year[4:6] == "00":
        print(f"#{i+1} -1")
    elif date[year[4:6]] < int(year[6:]):
        print(f"#{i+1} -1")
    else:
        print(f"#{i+1} {year[:4]}/{year[4:6]}/{year[6:]}")