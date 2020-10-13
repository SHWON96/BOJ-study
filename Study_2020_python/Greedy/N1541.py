# 작성자 : SH_WON_96
# 2020-10-06
# 알고리즘 - Greedy
# 문제번호 : 1541 잃어버린 괄호

# 초기 입력값 받기
import sys
import re
input = sys.stdin.readline

example = input().rstrip()

example = re.split('(-|\+)',example)

sumresult = 0
plma = 1 # 0 이면 더하고 1이면 빼기
for i in example:
    if i == "-":
        plma = 0
    elif i == '+' and plma == 1:
        plma = 1
    elif(i=='+'):
        continue
    else:
        num = int(i)
        if(plma==1):
            sumresult += num
        else:
            sumresult -= num

print(sumresult)