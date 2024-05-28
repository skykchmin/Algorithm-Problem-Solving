burger = list() 
soda = list() 

for i in range(0, 3): 
    burger.append(int(input())) 
    
for i in range(0, 2): 
    soda.append(int(input())) 

prices = [ (b+s-50) for b in burger for s in soda] 

print(min(prices))



