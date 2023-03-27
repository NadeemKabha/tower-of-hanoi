#include <stdio.h>
void towerOfHanoi(int size, char from, char help, char to)
{
    // size: num of disks, from: the current rod,to: the destination rod, help: the remaining rod
    if (size == 1)
    {
        printf("Move a disk from %c to %c\n", from, to);
        return;
    }
    towerOfHanoi(size - 1, from, to, help);
    printf("Move a disk from %c to %c\n", from, to);
    towerOfHanoi(size - 1, help, from, to);
}
int main()
{
    int size = 1;

    while (size)
    {
        printf("Please enter the desired number of disks (0 for exit): ");
        scanf("%d", &size);

        if (!size)
            printf("End!\n");
        else if (size < 0)
            printf("Wrong input please try again!\n");
        else
            towerOfHanoi(size, 'A', 'B', 'C');
    }
    return 0;
}