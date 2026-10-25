# Sorting Lab: Analysis

## i) What is your conclusion?

Bubble, insertion, selection, and merge sort were all fairly consistent as the array size increased, but bubble and selection sort grew more quickly and to a much higher extent than the other two. Insertion sort performed well on smaller arrays but eventually became slow as well. Merge sort was by far the most efficient, running in a short amount of time at every size. By array size 100,000, merge sort was hundreds of times faster than bubble sort. The results show the quadratic growth of bubble, selection, and (to a lesser degree) insertion sort, compared with merge sort's much slower rate of increase.

## ii) What accounts for the performance of each sort method?

Bubble and selection sort are slow because they compare or swap elements repeatedly, so their performance gets worse as the array grows. Insertion sort is somewhat better, especially for small or nearly sorted arrays. Merge sort is the best because it divides the array and handles large collections efficiently.

## iii) Ways to improve each method

- **Bubble sort:** stop early if a full pass makes no swaps.
- **Selection sort:** swap only once per pass to minimize operations.
- **Insertion sort:** find insertion positions more efficiently (for example, with binary search) to reduce comparisons.
- **Merge sort:** reduce the use of temporary arrays to save time and memory.
