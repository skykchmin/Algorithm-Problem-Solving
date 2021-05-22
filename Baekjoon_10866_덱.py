# class dequeue():
#     def __init__(self):
#         self.my_list = []
#         self.size = 0

#     def push_front(self, item):
#         self.my_list.insert(0, item)
#         self.size += 1

#     def push_back(self, item):
#         self.my_list.append(item)
#         self.size += 1
    
#     def pop_front(self):
#         if self.size == 0:
#             return -1
#         else:
#             self.size -= 1
#             return self.my_list.pop(0)
    
#     def pop_back(self):
#         if self.size == 0:
#             return -1
#         else:
#             self.size -= 1
#             return self.my_list.pop(-1)
    
#     def my_size(self):
#         return self.size
    
#     def empty(self):
#         if self.size == 0:
#             return 1
#         else:
#             return 0

#     def front(self):
#         if self.size == 0:
#             return -1
#         else:
#             return self.my_list[0]

#     def back(self):
#         if self.size == 0:
#             return -1
#         else:
#             return self.my_list[-1]

# N = int(input())
# deque = dequeue()

# for i in range(N):
#     input_list = input().split()
    
#     order = input_list[0]
    
#     if(order == 'push_front'):
#         deque.push_front(int(input_list[1]))
#     elif(order == 'push_back'):
#         deque.push_back(int(input_list[1]))
#     elif(order == 'pop_front'):
#         print(deque.pop_front())
#     elif(order == 'pop_back'):
#         print(deque.pop_back())
#     elif(order == 'front'):
#         print(deque.front())
#     elif(order == 'back'):
#         print(deque.back())
#     elif(order == 'empty'):
#         print(deque.empty())
#     elif(order == 'size'):
#         print(deque.size())

import sys

class Deque:
    def __init__(self):
        self.arr = list()
        
    def push_front(self, x):
        self.arr.insert(0, x)
    
    def push_back(self, x):
        self.arr.append(x)
    
    def pop_front(self):
        if(self.empty()):
            return -1
        else:
            return self.arr.pop(0)
        
    def pop_back(self):
        if(self.empty()):
            return -1
        else:
            return self.arr.pop()
        
    def front(self):
        if(self.empty()):
            return -1
        else:
            return self.arr[0]
        
    def back(self):
        if(self.empty()):
            return -1
        else:
            return self.arr[-1]
        
    def empty(self):
        return 1 if self.size() == 0 else 0
    
    def size(self):
        return len(self.arr)
    
N = int(sys.stdin.readline())
deque = Deque()

for _ in range(N):
    input_split = sys.stdin.readline().split()
    
    order = input_split[0]
    
    if(order == 'push_front'):
        deque.push_front(int(input_split[1]))
    elif(order == 'push_back'):
        deque.push_back(int(input_split[1]))
    elif(order == 'pop_front'):
        print(deque.pop_front())
    elif(order == 'pop_back'):
        print(deque.pop_back())
    elif(order == 'front'):
        print(deque.front())
    elif(order == 'back'):
        print(deque.back())
    elif(order == 'empty'):
        print(deque.empty())
    elif(order == 'size'):
        print(deque.size())
        