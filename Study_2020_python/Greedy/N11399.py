# 작성자 : SH_WON_96
# 2020-09-21
# 알고리즘 - Greedy
# 문제번호 : 11399 ATM

# 초기 입력값 받기
import sys
input = sys.stdin.readline


N = int(input())

people = list(map(int,list(input().strip().split(" "))))

#print(people)

people.sort()

tmp = 0
sumpeople = []
for i in people:
    tmp += i
    sumpeople.append(tmp)

result = 0

print(sum(sumpeople))