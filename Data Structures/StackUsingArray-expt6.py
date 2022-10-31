import sys
from array import *
a=array('i',[])
while True:
    print("\nChoose one :\n1.push 2.pop 3.display 4.Exit")
    ch=int(input())
    if ch==1:
        ele=int (input("Enter Elements : "))
        a.append(ele)
        print(ele,"--> Inserted")
    elif ch==2:
        if len(a)==0:
            print("Stack is empty !")
        else:
            print("Deleted Element is ",a.pop())
    elif ch==3:
        if len(a)==0:
            print("Stack is empty !")
        else:
            print("The Elemets in the stack are : ")
            for i in a : print(i)
    elif ch==4:
        sys.exit()
    else:
        print("Invalid Choice !")
"""
Output:
Choose one :
1.push 2.pop 3.display 4.Exit
1
Enter Elements : 1
1 --> Inserted

Choose one :
1.push 2.pop 3.display 4.Exit
1
Enter Elements : 2
2 --> Inserted

Choose one :
1.push 2.pop 3.display 4.Exit
1
Enter Elements : 3
3 --> Inserted

Choose one :
1.push 2.pop 3.display 4.Exit
3
The Elemets in the stack are : 
1
2
3

Choose one :
1.push 2.pop 3.display 4.Exit
2
Deleted Element is  3

Choose one :
1.push 2.pop 3.display 4.Exit
3
The Elemets in the stack are : 
1
2

Choose one :
1.push 2.pop 3.display 4.Exit
5
Invalid Choice !

Choose one :
1.push 2.pop 3.display 4.Exit
4
"""