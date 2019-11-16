#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Oct 30 21:21:46 2019

@author: apple
"""

import sys 
#-------------รับไฟล์-------------------------------------------------------sigle shortest source path--------------
file = open('test3.txt', 'r')

l = []
for line in file:
    t = line.strip().split()
    l.append(t)

vertex = int(l[0][0])
start=int(l[0][2])
edges=int(l[0][1])
l.remove(l[0])
p_size=int(l[-1][0])
l.remove(l[-1])
p=[]
for i in range(vertex):
        people=int(l[0][i])
        p.append(people)
l.remove(l[0])
graph = [[0 for x in range(vertex)] for y in range(vertex)]

for edge in l:
    r1 = int(edge[0])-1
    r2 = int(edge[1])-1
    graph[r1][r2] = int(edge[2])
file.close()
print(graph)

class Graph():  
    def __init__(self, vertices): 
        self.V = vertices 
        self.graph = graph

    def printSolution(self, dist): 
        print(" ยังไม่ได้เช็คจำนวนคนนะงิ ไว้ดูว่าดาวไหนมีค่าใช้จ่ายเท่าไร")
        print(p)
        print(" before check people Vertex (ดาวดวงที่)          \t Cost from Source")

        for node in range(self.V): 
            max_v=dist[node]+start
            
            if p[node]!=-1:
                if p[node]>0:
                 
                    for i in range(p[node]):
                        if max_v<Max:
                            print (node+1, "                                                   \t", dist[node]+start )
                            stack.append(dist[node]+start)
                        else:
                        
                             stack.append(-1)
                             print (node+1, "                                                   \t",-1 )
                
               
                
                else:
                    
                    if max_v<Max:
                        stack.append(dist[node]+start)
                        
                        print (node+1, "                                                   \t", dist[node]+start )
                    else:
                        stack.append(-1)
                        print (node+1, "                                                   \t",-1 )
                   
            
    print(stack)           
    min_index=0               
    def minDistance(self, dist, sptSet): 

        min = sys.maxsize
        global min_index    
        for v in range(self.V): 
            
            if dist[v] < min and sptSet[v] == False:
                min = dist[v] 
                min_index = v      
        return min_index 
          
        
    
                  

    def dijkstra(self, src): 
  
        dist = [sys.maxsize] * self.V 
        dist[src] = 0
        sptSet = [False] * self.V 
  
        for cout in range(self.V): 
            u = self.minDistance(dist, sptSet) 
            sptSet[u] = True
            
            for v in range(self.V): 
                
                if p[v]!=-1 :
                        if self.graph[u][v] > 0 and sptSet[v] == False and dist[v] > dist[u] + self.graph[u][v] : 
                               
                                dist[v] = ((dist[u] + self.graph[u][v] ))
                        
                        
                            
                   
                else:
                          dist[v] = 0
                
        self.printSolution(dist)
        self.printSolutionSort(dist)


    List = []
    def maxDistance(): 
        for i in range(self.V):
            vtt = dist[v]
            List.append(vtt)  
        for i in range(List):
         if List[i] <max:
             mix=List[i]
             max_index=i
        return i
    sum=0
    def checkPeople(p):
        global sum
        for i in range (len(p)):
            sum=p[i]
        if sum>p_size:
            count=sums-p_size
            max_init=maxDistance()
            for i in range(count):
                if p[max_init]!=0:
                    dis=p[max_init]
                    p[max_init]=dis-1
                else:
                   
                   p.pop(max_init)
                   List.pop(max_init)
    checkPeople(p)               
    def printSolutionSort(self, dist): 
        stack.sort()
        for i in range(len(stack)):
            if stack[i]==-1:
                stack.pop(0)
                stack.append(-1)
        size=int(len(stack))
        if stack!=p_size:
            for i in range(p_size-size):
                stack.append(-1)   
        print(" นับจำนวน people            \t Cost from Source")
        for node in range(p_size): 
            print (node+1,"                        \t ",stack[node])
    
           

g = Graph(vertex) 
stack=[]
Max=99999999
g.dijkstra(0)


