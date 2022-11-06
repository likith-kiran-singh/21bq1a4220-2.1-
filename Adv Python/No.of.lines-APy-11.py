#AIM:Find out number of lines, words ,characters in a  given text file.
filename=input('Enter a file name : ')
f=open(filename,'r')
lcount=wcount=ccount=0
for line in f:
    lcount += 1
    wcount += len(line.split())
    for l in line:
        if(l !='' and l !='\n'):
            ccount += 1
print('No. of Lines = ',lcount)
print('No. of Words = ',wcount)
print('No. of Characters = ',ccount)
f.close()
'''

Output :
i.  Enter a file name : Invoice.class
    No. of Lines =  19
    No. of Words = 64
    No. of Characters = 1246

ii. Enter a file name : StackUsingArray.py
    No. of Lines = 76
    No. of Words = 206
    No. of Characters = 1282
'''
