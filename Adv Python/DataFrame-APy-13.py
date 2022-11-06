'''
AIM:Write a Pandas program to create and display a DataFrame
from a specified dictionary data which has the index labels.
'''
import pandas as pd
import numpy as np
exam_data ={'name':['Anand','Adithya','Surendra','Navin','Bhargav','Eeshwar',
    'Sri Hari','Sarath','Komal','Likith'],
    'score':[12.5,9,16.5,np.nan,9,20,14.5,np.nan,8,19],
    'attempts':[1,3,2,3,2,3,1,1,2,1],
    'qualify':['yes','no','yes','no','no','yes','yes','no','no','yes']}
labels=['a','b','c','d','e','f','g','h','i','j']
df=pd.DataFrame(exam_data,index=labels)
print(df)
'''
       name  score  attempts qualify
a     Anand   12.5         1     yes
b   Adithya    9.0         3      no
c  Surendra   16.5         2     yes
d     Navin    NaN         3      no
e   Bhargav    9.0         2      no
f   Eeshwar   20.0         3     yes
g  Sri Hari   14.5         1     yes
h    Sarath    NaN         1      no
i     Komal    8.0         2      no
j    Likith   19.0         1     yes
'''