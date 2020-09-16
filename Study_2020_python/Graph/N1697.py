# 작성자 : SH_WON_96
# 2020-09-16
# 알고리즘 - Graph
# 문제번호 : 1697 숨바꼭질

# 초기 입력값 받기
import sys
import collections

queue = collections.deque([])
input = sys.stdin.readline
N,M = map(int, input().split(" "))

G = [0]*100001
visited = [0]*100001

def dx(put):
    change = []
    change.append(put - 1)
    change.append(put + 1)
    change.append(put * 2)
    return change

def findsoo(From,To):
    queue.append(From)
    visited[From] = 1
    while queue:

        x = queue.popleft()
        newx = dx(x)
        for i in range(3):
            nx = newx[i]
            if (0 <= nx <= 100000) :
                if (visited[nx] == 0 ):
                    visited[nx] = visited[x] + 1
                    queue.append((nx))
                elif (visited[nx] > 0):
                    visited[nx] = min(visited[x] + 1, visited[nx])
            if(nx==To):
                return visited


print(findsoo(N,M)[M]-1)



