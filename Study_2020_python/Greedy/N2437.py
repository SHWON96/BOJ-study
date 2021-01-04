# 작성자 : SH_WON_96
# 2020-11-13
# 알고리즘 - Greedy
# 문제번호 : 2437 저울

# 초기 입력값 받기
import sys

input = sys.stdin.readline
N = int(input())
M = list(map(int,input().split(" ")))
M.sort()
#print(M)

sum=1
for i in range(N):
    if sum < M[i]:
        break
    sum += M[i]

print(sum)

