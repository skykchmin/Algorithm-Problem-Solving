N = int(input())

arr = { }
for i in range(N):
    Name, status = input().split()
    if status == 'enter':
        arr[Name] = status
    else:
        del arr[Name]

# arr = sorted(arr, key = lambda x:x[0], reverse=True)
arr = sorted(arr.keys(), reverse = True)
for j in arr:
    print(j)

    