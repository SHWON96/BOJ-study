# 작성자 : SH_WON_96
# 2020-07-26
# 알고리즘 - DP
# 문제번호 : 2579

# 초기 입력값 받기
import sys
input = sys.stdin.readline

testNum = int(input())
arr = []
for i in range(testNum):
    arr.append(int(input()))

#print(stairs)

# 알고리즘 시작

# 초기 3개는 예외로 값을 잡아줘야한다.
def solution(stairs,testNum):
    # 3개 이상의 계단
    if testNum>2:
        dp = [0]*(testNum)
        dp[0] = stairs[0]
        dp[1] = max(dp[0]+stairs[1],stairs[1])
        dp[2] = max(dp[0]+stairs[2],stairs[1]+stairs[2])

        for i in range(3,testNum):
            first = dp[i-3]+stairs[i-1]+stairs[i]
            second = dp[i-2]+stairs[i]
            maxdp = max(first,second)
            dp[i] = (maxdp)
        return dp
    # 계단 2개
    elif(testNum == 2):
        dp = [0] * (testNum)
        dp[0] = stairs[0]
        dp[1] = max(dp[0] + stairs[1], stairs[1])
        return dp
    # 계단 1개
    else:
        dp = [stairs[0]]
        return dp


result = solution(arr,testNum)
print(result[testNum-1])
