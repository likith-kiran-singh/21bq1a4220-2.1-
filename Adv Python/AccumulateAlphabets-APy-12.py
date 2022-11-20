'''AIM : Accumulate all words into the respective alphabet buckets from the given text file.'''

filename=input('Enter a file name : ')
f=open(filename,'r')
Alphabet_Buckets={}
for word in f.read().split():
    if(word[0].isalpha()):
        temp=word.lower()
        if(temp[0]not in Alphabet_Buckets.keys()):
            Alphabet_Buckets[temp[0]]=[]
            Alphabet_Buckets[temp[0]].append(temp)
        else:
            Alphabet_Buckets[temp[0]].append(temp)
print(Alphabet_Buckets)
f.close()

'''
Text file name : sample

content in file:
wake up to reality . nothing goes as planned in  this accursed world.


Output:
Enter a file name : sample.txt
{'w': ['wake', 'world.'], 'u': ['up'], 't': ['to', 'this'], 'r': ['reality'],
'n': ['nothing'], 'g': ['goes'], 'a': ['as', 'accursed'], 'p': ['planned'], 'i': ['in']}
'''