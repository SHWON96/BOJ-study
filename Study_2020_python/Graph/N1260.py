# 작성자 : SH_WON_96
# 2020-09-14
# 알고리즘 - Graph
# 문제번호 : 1260 BFS, DFS

# 초기 입력값 받기
import sys
import math
input = sys.stdin.readline

N,M,V = map(int, input().split(" "))

G = [[0 for i in range(N+1)] for j in range(N+1)]



for i in range(M):
    x,y = map(int,input().split(" "))
    G[x][y] = 1
    G[y][x] = 1


# BFS
def BFS(G,s):
    queue = []
    Visit = []
    queue.append(s)
    Visit.append(s)
    while(len(queue)!=0):
        poped = queue.pop(0)
        for i in range(1,N+1):
            if(G[poped][i]== 1 and (i not in Visit)):
                queue.append(i)
                Visit.append(i)

    return Visit

# DFS
visit = []
def DFS(s,Visited):
    Visited.append(s)
    for i in range(1, N + 1):
        if (G[s][i] == 1 and (i not in Visited)):
            DFS(i,Visited)


    return Visited



for i in DFS(V,visit):
    print(i,end=" ")
print()
for i in BFS(G,V):
    print(i,end=" ")
