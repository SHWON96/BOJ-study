# 작성자 : SH_WON_96
# 2020-09-18
# 알고리즘 - Graph
# 문제번호 : 14502 연구소

# 초기 입력값 받기
import sys
import collections
import copy
input = sys.stdin.readline
N,M = map(int, input().strip().split(" "))
G = [[0]*M for i in range(N)]

empty = []
wheretwo = collections.deque()
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]
visited = [[0]*M for i in range(N)]

for i in range(N):
    x = input().strip().split(" ")
    for j in range(M):
        G[i][j] = int(x[j])
        if(int(x[j])==0):
            empty.append((i,j))
        if(int(x[j])==2):
            wheretwo.append((i,j))

#print(G)
#print(empty)


def countmax(Graph):
    queue = copy.deepcopy(wheretwo) # 2인 애들이 출발 지점
    while queue:
        x, y = queue.popleft()

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < M):
                if (Graph[nx][ny] == 0):
                    Graph[nx][ny] = 2
                    queue.append((nx, ny))

    count = 0
    for i in range(N):
        for j in range(M):
            if(Graph[i][j]==0):
                count +=1

    return count


countzero = 0
#최소 3개 이상의 빈칸 있댔음
for i in range(len(empty)):
    for j in range(i+1,len(empty)):
        for k in range(j+1,len(empty)):
            trialG = copy.deepcopy(G)
            trialG[empty[i][0]][empty[i][1]] = 1
            trialG[empty[j][0]][empty[j][1]] = 1
            trialG[empty[k][0]][empty[k][1]] = 1
            result = countmax(trialG)
            if(result > countzero):
                countzero = result

print(countzero)