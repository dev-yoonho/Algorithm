import sys 

spell = {'A+': 4.5, 'A0': 4.0, 'B+': 3.5, 'B0': 3.0, 'C+': 2.5, 'C0': 2.0, 'D+': 1.5, 'D0': 1.0, 'F': 0.0, 'P': 0.0}
credit = 0
crerate = 0
grade_list = [sys.stdin.readline().rstrip().split() for _ in range(20)]
for i in grade_list:
    if i[2] == 'P':
        continue
    credit += float(i[1])
    crerate += (float(i[1]) * spell[i[2]])
print(crerate / credit)