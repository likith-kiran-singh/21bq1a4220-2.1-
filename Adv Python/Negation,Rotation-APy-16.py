'''
AIM : Write a Python program to perform the following operations such as
Negation of an image ,Rotation of image ,Shrinking an image and,
Reversing an image.
'''
# Program

import cv2
import numpy as np
from matplotlib import pyplot as plt
image=cv2.imread('C:\Users\likit\OneDrive\Pictures\Screenshots\Screenshot.png',cv2.IMREAD_COLOR)
image=cv2.cvtColor(image,cv2.COLOR_BGR2RGB)
plt.figure(figsize=(10,15))
plt.subplots_adjust(left=0.1,bottom=0.1,right=0.9,top=0.9,wspace=0.4,
hspace=0.4)
plt.subplot(511)
plt.title('OriginalImage')
plt.imshow(image)
L=image.max()
imgNeg=L-image
plt.subplot(512)
plt.title('ImageNegative')
plt.imshow(imgNeg)
(num_rows,num_cols,_)=image.shape
img_rotation=cv2.warpAffine(image,cv2.getRotationMatrix2D((num_cols/2,
num_rows/2),30,0.6),(num_cols,num_rows))
plt.subplot(513)
plt.title('ImageRotation')
plt.imshow(img_rotation)
img_shrinked=cv2.resize(image,(350,300),interpolation=cv2.INTER_AREA)
plt.subplot(514)
plt.title('ShrinkedImage')
plt.imshow(img_shrinked)
src_points=np.float32([[0,0],[num_cols-1,0],[0,num_rows-1]])
dst_points=np.float32([[num_cols-1,0],[0,0],[num_cols-1,num_rows-1]])
matrix=cv2.getAffineTransform(src_points,dst_points)
img_afftran=cv2.warpAffine(image,matrix,(num_cols,num_rows))
plt.subplot(515)
plt.title('ReverseImage')
plt.imshow(img_afftran)