'''
AIM : Write a Python program to convert RGB to gray scale and
also display information of the image.
'''
#Program :

import cv2
from matplotlib import pyplot as plt
import imghdr
import os.path,time
image=cv2.imread('C:/Users/DELL/Pictures/Screenshots/Screenshot.png',cv2.IMREAD_COLOR)
plt.figure(figsize=(15,10))
plt.subplot(3,1,1)
plt.imshow(image)
image=cv2.cvtColor(image,cv2.COLOR_BGR2RGB)
plt.subplot(3,1,2)
plt.imshow(image)
image1=cv2.cvtColor(image,cv2.COLOR_RGB2GRAY)
plt.subplot(3,1,3)
plt.imshow(image1)
plt.show()
image2=os.path.basename("C:/Users/DELL/Pictures/Screenshots/Screenshot.png")
print('Nameoftheimagefile=',image2)
print('Sizeofimage=',image1.size)
print(imghdr.what('C:/Users/DELL/Pictures/Screenshots/Screenshot.png'))
print("Lastmodified:%s"%
time.ctime(os.path.getmtime("C:/Users/DELL/Pictures/Screenshots/Screenshot.png")))
print("Created:%s"%
time.ctime(os.path.getctime("C:/Users/DELL/Pictures/Screenshots/Screenshot.png")))

'''
Output :
Name of the image file_desktop1.png
Size of the image = 240036
png
Last modified date is Mon Aug 1 18:28:50 2022
Created date is Mon Aug 1 12:58:04 2022
'''