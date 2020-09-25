# 작성자 : SH_WON_96
# 2020-09-25
# 알고리즘 - DP
# 문제번호 : 2225 합분해


# 초기 입력값 받기
import sys
input = sys.stdin.readline

N, K = map(int,input().strip().split(" "))




def comb(N,K):
    multi = 1
    div = 1
    for i in range(N-K+1,N+1):
        multi *= i
    for i in range(1,K+1):
        div *= i
    return multi//div%1000000000


print(comb(N+K-1,K-1))
#print(comb(200,3))