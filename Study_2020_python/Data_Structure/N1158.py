# 작성자 : SH_WON_96
# 2020-08-26
# 알고리즘 - Data Structure
# 문제번호 : 1158

# 초기 입력값 받기
import sys
input = sys.stdin.readline

example = input().split(" ")
queue = [i for i in range(1,int(example[0])+1)]
result = []
skip = int(example[1])



index = skip -1
for i in range(int(example[0])):
    if len(queue) > index:
        result.append(queue.pop(index))
        index += skip-1
    elif len(queue) <= index:
        index = index%len(queue)
        result.append(queue.pop(index))
        index += skip-1


pstr = "<"
for i in range(len(result)):
    if (i == len(result)-1):
        pstr = pstr + str(result[i])
    else:
        pstr = pstr + str(result[i])+", "

pstr = pstr + ">"

print(pstr)