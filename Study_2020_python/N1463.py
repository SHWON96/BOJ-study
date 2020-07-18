# 2020-07-18
# 알고리즘 - DP
# 문제번호 : 1463

# 메모이제이션

testNum = int(input())

dp = []
dp.append(0)
def Devidedp(testNum):
    if(testNum == 1):
        #print(1)
        dp.append(0)
    elif(testNum == 2):
        #print(1)
        dp.append(1)
    elif(testNum == 3):
        dp.append(1)
    else:
        if(testNum%3 == 0 and testNum%2 == 0):
            dp.append(min(dp[testNum-1],dp[int(testNum/2)],dp[int(testNum/3)])+1)
        elif(testNum%3 == 0):
            dp.append(min(dp[testNum-1],dp[int(testNum/3)])+1)
        elif(testNum%2 == 0):
            dp.append(min(dp[testNum-1],dp[int(testNum/2)])+1)
        else:
            dp.append(dp[testNum-1]+1)

for i in range(1,testNum+1):
    Devidedp(i)
    #print(str(i), " ", str(dp[i]))
    #print(dp[testNum+1])

print(dp[testNum])