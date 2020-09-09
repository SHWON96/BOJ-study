# 작성자 : SH_WON_96
# 2020-09-08
# 알고리즘 - Data Structure
# 문제번호 : 10845

# 초기 입력값 받기

import sys
import re
input = sys.stdin.readline
testCase = int(input())
queue = []


def calculate(text):
    text = text.rstrip()
    commend = text.split(" ")

    if(commend[0] == "push"):
        #print(commend[1],end="")
        queue.append(commend[1])
    elif(commend[0] == "front"):
        if(len(queue)==0):
            print(-1)
        else:
            print(queue[0])
    elif (commend[0] == "pop"):
        if (len(queue) == 0):
            print(-1)
        else:
            print(queue.pop(0))


    elif (commend[0] == "size"):
        print(len(queue))
    elif (commend[0] == "empty"):
        if(len(queue)==0):
            print(1)
        else:
            print(0)
    elif (commend[0] == "back"):
        if(len(queue)==0):
            print(-1)
        else:
            print(queue[-1])

for i in range(testCase):
    text = (input())
    calculate(text)




