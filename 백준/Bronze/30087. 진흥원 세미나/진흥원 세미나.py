import sys
input = sys.stdin.readline

seminar_schedule = {
    "Algorithm": "204",
    "DataAnalysis": "207",
    "ArtificialIntelligence": "302",
    "CyberSecurity": "B101",
    "Network": "303",
    "Startup": "501",
    "TestStrategy": "105"
}

n = int(input())

for _ in range(n):
    subject = input().rstrip()

    print(seminar_schedule[subject])