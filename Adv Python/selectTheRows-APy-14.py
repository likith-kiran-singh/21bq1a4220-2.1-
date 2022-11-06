'''
AIM: Write a Pandas program to select the rows where number
of attempts in the examination is less than 2 and score
greater than 15.
'''
#Program :
import pandas as pd
import numpy as np
exam_data ={'name':['Anand','Adithya','Surendra','Navin','Bhargav','Eeshwar','Sri Hari','Sarath','Likith','Komal'],
    'score':[12.5,9,16.5,np.nan,9,20,14.5,np.nan,20,8],
    'attempts':[1,3,2,3,2,3,1,1,1,2],
    'qualify':['yes','no','yes','no','no','yes','yes','no','yes','no']}
labels=['a','b','c','d','e','f','g','h','i','j']
df=pd.DataFrame(exam_data,index=labels)
print("Number of attempts in the examination is less than 2 and score greater than 15 : ")
print(df[(df['attempts']<2)&(df['score']>15)])

'''
Output : 
Number of attempts in the examination is less than 2 and score greater than 15 : 
     name  score  attempts qualify
i  Likith   20.0         1     yes
'''