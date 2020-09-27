# 작성자 : SH_WON_96
# 2020-09-27
# 알고리즘 - DP
# 문제번호 : 9625 BABBA

# 초기 입력값 받기
import sys
input = sys.stdin.readline
#sys.setrecursionlimit(10000)

N,M = map(int,input().strip().split())

S = {input().strip() for i in range(N)}

count = 0


for i in range(M):
    if input().strip() in S:
        count += 1

print(count)

