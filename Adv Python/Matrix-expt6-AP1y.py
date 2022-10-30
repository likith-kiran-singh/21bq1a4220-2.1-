import numpy as np
r1=int(input("Enter no. of rows : "))
c1=int(input("Enter no. of columns : "))
print("Enter the elements with spaces in one line : ")
ele1= list(map(int,input().split()))
arr1=np.array(ele1).reshape(r1,c1)
print(arr1)
r2=int(input("Enter no. of rows : "))
c2=int(input("Enter no. of columns : "))
print("Enter the elements with spaces in one line : ")
ele2= list(map(int,input().split()))
arr2=np.array(ele2).reshape(r2,c2)
print(arr2)
if r1==r2 and c1==c2:
    print("Adition of two matrices : ")
    print(np.add(arr1,arr2))
    print("Element by element multiplication : ",np.multiply(arr1,arr2))
elif r1==c2:
    print("multiplication of two matrices : ")
    print(arr1.dot(arr2))

else:
    print("Matrics addition and scalar multiplication are not possible")

