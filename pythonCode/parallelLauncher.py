import assignment2
from multiprocessing import Pool, cpu_count

# if in main thread:
if __name__ == '__main__':
    # create a parallel pool resource
    parallelPool = Pool(cpu_count())
    print('Opening Parallel Pool')
    
    # launch the assignment function
    assignment2.assignment2(parallelPool)