import numpy as np
r,c=list(map(int,input("enter row and column size : ").split()))
a=np.array(list(map(int,input("Enter elements:").split()))).reshape(int(r),int(c))
print(a)
if r==c:
    v,w=np.linalg.eig(a)
    print("Eigen values are : ",v)
    print("Eigen vectors are : \n",w)
else:
    print("Eigen values are only calculated for square matrices")