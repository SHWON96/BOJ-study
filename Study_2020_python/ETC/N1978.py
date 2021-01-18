# 작성자 : SH_WON_96
# # 2021-01-18
# # 알고리즘 - 수학/정수론
# # 문제번호 : 1978 소수 찾기
#
# # 초기 입력값 받기
import sys
input = sys.stdin.readline


N = int(input())

# 숫자리스트 받기
num = list(map(int,input().split()))

# num에서 소수가 몇개있는지 찾아야함
count = 0

# 소수는 에라토스테네스의 체로 찾을 수 있음. 아래 코드는

def prime_list(n):
    # 에라토스테네스의 체 초기화: n개 요소에 True 설정(소수로 간주)
    sieve = [True] * n

    # n의 최대 약수가 sqrt(n) 이하이므로 i=sqrt(n)까지 검사
    m = int(n ** 0.5)
    for i in range(2, m + 1):
        if sieve[i] == True:           # i가 소수인 경우
            for j in range(i+i, n, i): # i이후 i의 배수들을 False 판정
                sieve[j] = False

    # 소수 목록 산출
    return [i for i in range(2, n) if sieve[i] == True]

num.sort()

result = prime_list(num[-1]+1)

print(result)


a = set(result).intersection(num)
print(a)
print(len(a))