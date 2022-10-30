import numpy as np
r,c=list(map(int,input("enter row and column size : ").split()))
print("Enter the elements with spaces in one line : ")
ele= list(map(int,input().split()))
arr=np.array(ele).reshape(r,c)
print(arr)
print("Transpose of matrix  : ")
print(arr.T)