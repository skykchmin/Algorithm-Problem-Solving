N, M = map(int, input().split())

blist = []
plist = []
for i in range(M):
    bundle, piece = map(int, input().split())
    blist.append(bundle)
    plist.append(piece)

min_blist = min(blist) # 6개 묶음에서 최소값 찾기
min_plist = min(plist) # 낱개 묶음에서 최소값 찾기

share = N // 6 # 몫
remain = N % 6 # 나머지

A = share * min_blist + remain * min_plist
B = min_plist * N
C = (share + 1) * min_blist

print(min(A, B, C))

# 