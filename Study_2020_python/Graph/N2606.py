# 작성자 : SH_WON_96
# 2020-09-15
# 알고리즘 - Graph
# 문제번호 : 2606 바이러스


import sys
import collections


input = sys.stdin.readline
N = int(input())
M = int(input())

# 시작
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
count = 0
find = 1
max = 0

G = [[0]*N for j in range(N)]
visited = [[0]*N for i in range(N)]
for i in range(M):
    x,y = map(int,input().split(" "))
    G[x-1][y-1] = 1
    G[y-1][x-1] = 1


def BFS(G):
    queue = collections.deque([])
    Visit = []
    queue.append(0)
    Visit.append(0)
    while(len(queue)!=0):
        poped = queue.popleft()
        for i in range(N):
            if(G[poped][i]== 1 and (i not in Visit)):
                queue.append(i)
                Visit.append(i)

    return Visit

result = BFS(G)


print(len(result)-1)