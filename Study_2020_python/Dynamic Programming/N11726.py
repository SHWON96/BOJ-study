# 작성자 : SH_WON_96
# 2020-07-19
# 알고리즘 - DP
# 문제번호 : 11726



# def combinations(a,b):
#     above = 1
#     below = 1
#     for i in range(b):
#         above = above*a
#         a = a-1
#     for j in range(b):
#         below = below * b
#         b = b - 1
#     return int(above/below)
#
# def cal(number):
#     sum = 0
#     if (number%2 == 0):
#         half = int(number/2)
#         j = 0
#         for i in range(half, number+1):
#             sum = sum + combinations(i,j)
#             j = j + 2
#     else:
#         half = int((number+1)/2)
#         j = 1
#         for i in range(half, number+1):
#             sum = sum + combinations(i,j)
#             j = j + 2
#     return sum%10007
#
# testNum = int(input())
# print(cal(testNum))

testNum = int(input())
s = [0, 1, 2]
for i in range(3, 1001):
  s.append(s[i - 2] + s[i - 1])

print(s[testNum] % 10007)
