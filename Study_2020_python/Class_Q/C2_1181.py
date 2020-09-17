# 작성자 : SH_WON_96
# 2020-09-17
# 알고리즘 - Class2
# 문제번호 : 1181 단어 정렬

# 초기 입력값 받기
import sys
input = sys.stdin.readline

TestCase = int(input())
alphalist = []
for i in range(TestCase):
    alphalist.append(input().strip())

alphalist = list(dict.fromkeys(alphalist))

where = [[] for i in range(51)]

for i in alphalist:
    where[len(i)].append(i)

for i in range(1,51):
    if(len(where[i])>0):
        where[i].sort()
        for j in range(len(where[i])):
            print(where[i][j])
