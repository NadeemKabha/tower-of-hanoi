def towerOfHanoi(size:int, fromr:str, help:str, to:str):

    # size: num of disks, fromr: the current rod,to: the destination rod, help: the remaining rod
    if (size == 1):
    
        print(f"Move a disk from {fromr} to {to}" )
        return
    
    towerOfHanoi(size - 1, fromr, to, help)
    print(f"Move a disk from {fromr} to {to}" )
    towerOfHanoi(size - 1, help, fromr, to)



size = 1

while (size):

    size=int(input("Please enter the desired number of disks (0 for exit): "))

    if (not size):
        print("End!")
    elif (size < 0):
        print("Wrong input please try again!")
    else:
        towerOfHanoi(size, 'A', 'B', 'C')

