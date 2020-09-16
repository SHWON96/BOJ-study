# 작성자 : SH_WON_96
# 2020-09-16
# 알고리즘 - Graph
# 문제번호 : 12851 숨바꼭질2

# 초기 입력값 받기
import sys
import collections

queue = collections.deque([])
input = sys.stdin.readline
N,M = map(int, input().split(" "))

novisit = 12345
G = [0]*100001
visited = [[novisit,0] for _ in range(100001)]

def dx(put):
    change = []
    change.append(put - 1)
    change.append(put + 1)
    change.append(put * 2)
    return change


queue.append(N)
visited[N] = [0,1] #[몇 초, 방문횟수]
while queue:
    x = queue.popleft()
    newx = dx(x)
    for i in range(3):
        nx = newx[i]
        if (0 <= nx <= 100000) :
            if (visited[nx][0] == novisit):
                visited[nx][0] = visited[x][0] + 1
                visited[nx][1] = visited[x][1] # 최초 방문 1회
                queue.append((nx))


            elif(visited[nx][0] == visited[x][0]+1):
                # 방문한 횟수 추가(nx까지의 경우의 수)
                visited[nx][1] = visited[nx][1] + visited[x][1]



print(visited[M][0])
print(visited[M][1])