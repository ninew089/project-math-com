#------------------------------- รับไฟลล์ แปลงมาเป็น ---------------------------
file = open('6.1.txt', 'r')

l = []
for line in file:
    t = line.strip().split()
    l.append(t)

vertex = int(l[0][0])
l.remove(l[0])
graph = [[0 for x in range(vertex)] for y in range(vertex)]

for edge in l:
    r1 = int(edge[0])-1
    r2 = int(edge[1])-1
    graph[r1][r2] = 1

file.close()

#-------------------------------------------------------------------------

#Node class
class Node:
    def __init__(self, id):
        self.id = id
        self.start = None
        self.color = 'white'
        self.timeStart = 0
        self.timeStop = 0

#DFS
def DFS(vertexList):
    for v1 in vertexList:
        v1.color = 'white'

Stackfinal = [] 
time = 0
List = []
for i in range(vertex):
    vtt = Node(i)
    List.append(vtt)
for vt in List:
    if vt.color == 'white':
        visitDFS(vt) 


def visitDFS(v2):
    global time
    time += 1
    v2.timeStart = time
    v2.color = 'gray'
    for i in range(vertex):
        if graph[v2.id][i] == 1 and List[i].color == 'white':
            List[i].start = v2
            visitDFS(List[i])
    v2.color = 'black'
    time += 1
    v2.timeStop = time
    Stackfinal.append(v2)
#transpose กราฟ
t_graph = [[graph[j][i] for j in range(len(graph))] for i in range(len(graph[0]))]
#reverse stack
bfinsh = [Stackfinal[i] for i in range(len(Stackfinal)-1, -1, -1)] 

#รีเซ็ตcolor ให้หมด
DFS(bfinsh)

#เรียกให้ visit again  for add scc in sccl list
scc = [[] for g in range(vertex)]
def findMaxV(v, cnt):
    v.color = 'gray'
    for j in range(vertex):
        if t_graph[v.id][j] == 1 :
            for vtx in bfinsh:
                if vtx.id == j and vtx.color == 'white':
                    findMaxV(vtx, cnt)
    v.color = 'black'
    scc[cnt].append(v)

#เริ่ม DFS ครั้งที่่สอง
index = 0
for v3 in bfinsh:
    if v3.color == 'white':
        findMaxV(v3, index)
        index += 1

#ห่า max scc vertices
maxLen = 0
for t in scc:
    if maxLen<len(t):
        maxLen=len(t)
print(f'Max vertices : {maxLen}')


Sccl = list(filter(None, scc))
adjMatrix = [[0 for x in range(len(Sccl))]for y in range(len(Sccl))]
for i in range(len(Sccl)):
    for j in Sccl[i]:
        for k in range(len(Sccl)):
            if (k!=i):
                for l in Sccl[k]:
                    if(graph[j.id][l.id]==1):
                        adjMatrix[i][k] = 1
                        break
#หาเส้นเชื่อมที่นอ้งที่สุดใน >_<
cnt = 0
depht = 0
def leastSCC(ind):
    global cnt, depht
    for p in range(len(adjMatrix)):
        if(adjMatrix[ind][p]==1):
            cnt += 1
            leastSCC(p)
            if(depht<cnt):
                depht = cnt
            cnt-=1
leastSCC(0)
print(f'Need to add at least {len(adjMatrix)-maxx} edge(s)')
print(f'depht  :{depht} edge(s)')
print(f'adjMatrix:{len(adjMatrix)} edge(s)')
