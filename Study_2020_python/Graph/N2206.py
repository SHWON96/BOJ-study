# 작성자 : SH_WON_96
# 2020-09-19
# 알고리즘 - Graph
# 문제번호 : 2206 벽 부수고 이동하기

# 초기 입력값 받기
import sys
import collections
import copy
input = sys.stdin.readline
N,M = map(int, input().strip().split(" "))
#G = [[0]*M for i in range(N)]

#whereone = collections.deque()
dx, dy = [-1, 1, 0, 0], [0, 0, -1, 1]

G = []
for i in range(N):
    G.append(list(map(int, list(input().strip()))))

#print(G)

# visited[i][j][0] 방문 여부를 체크
# visited[i][j][1] 뚫은 여부를 체크 1이면 안 뚫은 것, 0 이면 뚫은 것

def countmax(Graph):
    queue = collections.deque()
    queue.append([0,0,1])
    visited = [[[0] * 2 for j in range(M)] for i in range(N)]
    visited[0][0][1] = 1

    while queue:
        x, y,z = queue.popleft()
        if x == N-1 and  y == M-1:
            return visited[x][y][z]

        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if (0 <= nx < N) and (0 <= ny < M):
                # 뚫을 수 있고, 벽인 경우
                if (Graph[nx][ny] == 1 and z==1):
                    visited[nx][ny][0] = visited[x][y][1]+1
                    queue.append([nx, ny,0])
                # 아직 방문 안하고, 벽이 아닌 경우 / z= 1이면 아직 안 뚫었다는 뜻 / z = 0 이면 뚫었고, x,y가 아직 방문 안한곳인지 확인 하는 것
                elif(Graph[nx][ny]==0 and visited[nx][ny][z]==0):
                    visited[nx][ny][z] = visited[x][y][z] + 1
                    queue.append([nx,ny,z])

    return -1

print(countmax(G))

#최소 3개 이상의 빈칸 있댔음
# for i in range(len(whereone)):
#     trialG = copy.deepcopy(G)
#     trialG[whereone[i][0]][whereone[i][1]] = 0
#     result = countmax(trialG)
#     if(result != 0 and result<findist):
#         findist = result


#
#
# if(findist == 99999999):
#     print(-1)
# else:
#     print(findist)