'''
AIM:Demonstrate the pass percentage of students joined in 2019-20 academic year
in I-II semester with the help of bar chart, piechart, scatterplot.
'''
import pandas as pd
#Read the address of the file

data=pd.read_excel("E:/Academics/Python/AdvancedPythonProgramming/Marks.xlsx",sheet_name='Sheet1')
import matplotlib.pyplot as plt
fig,(ax1,ax2,ax3,ax4)=plt.subplots(nrows=4,ncols=1,figsize=(15,15))
plt.title("Student-Grades")
ax1.plot(data.iloc[0:10,0],data.iloc[0:10,4],'-.c')
ax2.bar(data.iloc[0:10,0],data.iloc[0:10,4],color='orange')
ax3.pie(data.iloc[0:10,4],labels=data.iloc[0:10,0],
autopct="%1.1f%%",startangle=90)
ax4.scatter(data.iloc[0:10,0],data.iloc[0:10,4],color='magenta')