# 작성자 : SH_WON_96
# 2020-10-13
# 알고리즘 - Greedy
# 문제번호 : 1339 단어 수학

# 초기 입력값 받기
import sys
import re
input = sys.stdin.readline

N = int(input())
numlist = []
alphakind = dict()
for i in range(N):
    numlist.append(input().strip())


for number in numlist:
    for i in range(len(number)):
        chracter = number[i]
        if chracter in alphakind:
            alphakind[chracter] = alphakind[chracter]+10 ** (len(number) - i - 1)
        else:
            alphakind[chracter] = 10 ** (len(number) - i - 1)

relist = list(alphakind.values())
relist.sort(reverse=True)
result = 0
decre = 9

for i in relist:
    result += i*decre
    decre -=1
print(result)

