#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Wed Nov 20 16:51:12 2019

@author: apple
"""
#-------------รับไฟล์-------------------------------------------------------------------------------------------------------
file = open('test1.txt', 'r')

l = []
for line in file:
    t = line.strip().split()
    l.append(t)

l.remove(l[0])
M=int(l[0][0])
N=int(l[0][1])
l.remove(l[0])
pat=[]
for i in range(M):
        char=(l[0][i])
        pat.append(char)
l.remove(l[0])
txt=[]
for i in range(N):
        char=(l[0][i])
        txt.append(char)
l.remove(l[0])
file.close()
#---------------


#------------------------------------------------------------------------------------------------------------------------------
print("KMPSearch Pattern :")
def KMPSearch(pat, txt): 
	M = len(pat) 
	N = len(txt) 
	lps = [0]*M
	j = 0
	global count
	computeLPSArray(pat, M, lps) 
	i = 0
	while i < N: 
		if pat[j] == txt[i]: 
			i += 1
			j += 1

		if j == M: 
			print ("Found pattern at index " + str(i-j+1) +"  LR")
			count += 1
			j = lps[j-1]
		elif i < N and pat[j] != txt[i]: 
	
			if j != 0: 
				j = lps[j-1] 
			else: 
				i += 1
def KMPSearch_re(pat, txt): 
	M = len(pat) 
	N = len(txt) 
	lps = [0]*M
	global count
	j = 0 
	computeLPSArray(pat, M, lps) 
	i = 0 
	while i < N: 
		if pat[j] == txt[i]: 
			i += 1
			j += 1
		if j == M: 
			print ("Found pattern at index " + str(N-(i-j)-1) +"  RL")
			count += 1
			j = lps[j-1]  
		elif i < N and pat[j] != txt[i]: 
			if j != 0: 
				j = lps[j-1] 
			else: 
				i += 1

def computeLPSArray(pat, M, lps): 
	len = 0 
	lps[0] 
	i = 1

	while i < M: 
		if pat[i]== pat[len]: 
			len += 1
			lps[i] = len
			i += 1
		else: 
			
			if len != 0: 
				len = lps[len-1] 

			else: 
				lps[i] = 0
				i += 1


re_txt=[]
i=len(txt)
while i>=0:
    re_txt.append(txt[i-1])
    i=i-1
count=0
l1 = len(pat)

j = 0
k = 1
prefix = [0]

while len(prefix) < l1:
    if pat[j] == pat[k]:
        prefix.append(j+1)
        k += 1
        j += 1
    else:
        if j == 0:
            prefix.append(0)
            k += 1
        if j != 0:
            j = prefix[j-1]
print(prefix)

KMPSearch(pat, txt) 
KMPSearch_re(pat, re_txt) 
print(count)
 
print("Naive Pattern Searching:")
# -------------------------------------------------------------------------------------------
def search_re(pat, txt): 

    for i in range(N - M + 1): 
        j = 0

        while(j < M): 
            if (txt[i + j] != pat[j]): 
                break
            j += 1
  
        if (j == M):  
            print("Found pattern at index ", N-i ," RL") 
def search(pat,txt): 
    for i in range(N - M + 1): 
        j = 0

        while(j < M): 
            if (txt[i + j] != pat[j]): 
                break
            j += 1
  
        if (j == M):  
            print("Found pattern at index ", i+1,"LR" )  
search(pat,txt) 
search_re(pat, re_txt) 

