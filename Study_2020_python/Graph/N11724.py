# 작성자 : SH_WON_96
# 2020-09-20
# 알고리즘 - Graph
# 문제번호 : 11724 연결 요소의 갯수


import sys
import collections


input = sys.stdin.readline
N,M = map(int,input().strip().split(" "))


# 시작
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]


G = [[0]*(1+N) for j in range(1+N)]
#Visited = [[0]*N for j in range(N)]
oneque = []
for i in range(M):
    x,y = map(int,input().split(" "))
    G[x][y] = 1
    G[y][x] = 1
    oneque.append((x,y))




def BFS(G,s, visited):

    queue = collections.deque()
    queue.append(s)
    while queue:
        y = queue.popleft()
        visited.add(y)
        for i in range(1,N+1):
            if(G[y][i]== 1 and (i not in visited)):
                queue.append(i)
                visited.add(i)


    return 1

visited = set()
count  = 0

for i in range(1,N+1):
    if i not in visited:
        visited.add(i)
        count += BFS(G,i,visited)

print(count)