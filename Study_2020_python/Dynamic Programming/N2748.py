# 작성자 : SH_WON_96
# 2020-09-25
# 알고리즘 - DP
# 문제번호 : 2748 피보나치 수2


# 초기 입력값 받기
import sys
input = sys.stdin.readline

N = int(input())
fibo = [0]*(N+1)

fibo[1] = 1


for i in range(2,N+1):
    fibo[i]= fibo[i-1]+fibo[i-2]

print(fibo[-1])


