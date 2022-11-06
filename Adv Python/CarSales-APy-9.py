'''
Experiment : 9:(Modified Version !!)
AIM  : To Demonstrate the car sales of a showroom during the last 6 months
with the help of bar chart . (Usematplotlib),demonstrate.

'''
from matplotlib import pyplot as plt
import numpy as np
x1=['Audi','Benz','BMW','Jaguar','Landrover']
y1=[100,200,280,165,220]
x2=['Tata','Ford','Ferrari','Mahindra','Rolls Royce']
y2=[300,160,175,265,350]
x3=['Suzuki','Buggati','Mclaren','Porshe','Jeep']
y3=[210,120,135,145,155]
plt.figure(figsize=(15,6))
plt.title('Cars-Sales-Information')
plt.bar(x1,y1,color='r',label='2019',align='center')
plt.bar(x2,y2,color='b',label='2020',align='center')
plt.bar(x3,y3,color='g',label='2021',align='center')
plt.xlabel('Car Models')
plt.ylabel('Sales in Crores(.rs)')
plt.legend(loc='upper right')
plt.xticks(rotation=45)
plt.yticks(rotation=50)
plt.show()
