x, y, w, h = map(int, input().split())

result = min(h - y, y, x, w - x)
print(result)