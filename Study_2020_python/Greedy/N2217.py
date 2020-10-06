# 작성자 : SH_WON_96
# 2020-10-06
# 알고리즘 - Greedy
# 문제번호 : 2217 로프

# 초기 입력값 받기
import sys
input = sys.stdin.readline
N = int(input())
ropes = []
for i in range(N):
    ropes.append(int(input()))


ropes.sort(reverse=True)

Mweight = 0

for i in range(N):
    if(ropes[i]*(i+1)>Mweight):
        Mweight = ropes[i]*(i+1)

print(Mweight)