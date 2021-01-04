# 2020-07-18
# 2020-12-29 review
# 알고리즘 - DP
# 문제번호 : 1463

# 메모이제이션

testNum = int(input())

dp = {}
dp[1] = 0

def Devidedp(testNum):
    if testNum in dp:
        return dp[testNum]
    if(testNum%3 == 0 and testNum%2 == 0):
        dp[testNum] = min(Devidedp(testNum-1),Devidedp(testNum//2),Devidedp(testNum//3))+1
    elif(testNum%3 == 0):
        dp[testNum] = min(Devidedp(testNum-1),Devidedp(testNum//3))+1
    elif(testNum%2 == 0):
        dp[testNum] = min(Devidedp(testNum-1),Devidedp(testNum//2))+1
    else:
        dp[testNum] = Devidedp(testNum-1)+1
    return dp[testNum]

#Devidedp(testNum+1)
# for i in range(1,testNum+1):
#     Devidedp(i)
    #print(str(i), " ", str(dp[i]))
    #print(dp[testNum+1])

print(Devidedp(testNum))