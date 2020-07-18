# -*- coding: utf-8 -*-
"""
Created on Sat May 16 17:47:02 2020

@author: cowgi
"""

array = [1, 5, 2, 6, 3, 7, 4]

commands = [[2, 5, 3], [4, 4, 1], [1, 7, 3]]

answer = []

for z in range(len(commands)):
    i = commands[z][0]
    j = commands[z][1]
    k = commands[z][2]
    
    result = array[i-1:j]
    result.sort()
    answer.append(result[k-1])    
            


#%%
    
def sosu(n):
    