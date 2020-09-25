# 작성자 : SH_WON_96
# 2020-09-25
# 알고리즘 - DP
# 문제번호 : 9251 LCS 문제


# 초기 입력값 받기
import sys
input = sys.stdin.readline
#
# X = list(input().strip())
# Y = list(input().strip())
#
# LCS =[[0]*(len(Y)+1) for i in range(len(X)+1)]
#
# for i in range(len(X)):
#     for j in range(len(Y)):
#         if(X[i]==Y[j]):
#             LCS[i+1][j+1] = LCS[i][j]+1
#         elif(LCS[i][j+1]>=LCS[i+1][j]):
#             LCS[i+1][j+1] = LCS[i][j+1]
#         else:
#             LCS[i+1][j+1] = LCS[i+1][j]
#
# print(LCS[len(X)][len(Y)]


###
X = input().strip()
Y = input().strip()

arr = [0 for _ in range(len(Y))]

for i in range(len(X)):
    max_num = 0
    for j in range(len(Y)):
        if max_num < arr[j]:
            max_num = arr[j]
        elif X[i] == Y[j]:
            arr[j] = max_num + 1

print(max(arr))