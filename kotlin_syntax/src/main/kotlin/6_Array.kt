fun main() {
    val fruits = arrayOf("Apple", "Mango", "Banana", "Orange")
    val fruits_2 = arrayOf<String>("Apple", "Mango", "Banana", "Orange")

    val num = intArrayOf(1,2,3,4,5,6,7)

   /*
   * byteArrayOf()
   * charArrayOf()
   * shortArrayOf()
   * longArrayOf()
   * */

    println(fruits[1])
    println(num[6])

    println(fruits.get(3))

    fruits.set(3, "Guava")

    println(fruits.get(3))

    println(fruits.size)

    for(item in fruits) {
        print(item + " ")
    }
    println("")

    if("Mango" in fruits) {
        println("Mango is in the list")
    } else {
        println("Mango is not in the list")
    }

    var arr = arrayOf(1,2,3,4,4,5,6,7,7,7,7)
    var brr = arr.distinct()

    for(value in brr) {
        print(value)
        print(",")
    }
    println("")

    brr = brr.drop(2)
    for(value in brr) {
        print(value)
        print(",")
    }
    println("")

    val crr =  arrayOf<Int>()
    println(crr.isEmpty())
}

/*
* 1	get()
Returns the array element at the specified index.

2	set()
Sets the array element at the specified index to the specified value.

3	iterator()
Creates an iterator for iterating over the elements of the array.

4	all()
Returns true if all elements match the given predicate.

5	any()
Returns true if array has at least one element.

6	average()
Returns an average value of elements in the array.

7	binarySearch()
Searches the array or the range of the array for the provided element using the binary search algorithm.

8	component1()
Returns 1st element from the array.

9	component2()
Returns 2nd element from the array.

10	component3()
Returns 3rd element from the array.

11	component4()
Returns 4th element from the array.

12	component5()
Returns 5th element from the array.

13	contains()
Returns true if element is found in the array.

14	count()
Returns the number of elements in the array.

15	distinct()
Returns a list containing only distinct elements from the given array.

16	last()
Returns the last element.

17	distinctBy()
Returns a list of the distinct elements from the given array or collection.

18	drop()
Returns a list containing all elements except first n elements.

19	dropLast()
Returns a list containing all elements except last n elements.

20	dropLastWhile()
Returns a list containing all elements except last elements that satisfy the given predicate.

21	dropWhile()
Returns a list containing all elements except first elements that satisfy the given predicate.

22	elementAtOrElse()
Returns an element at that index If the given index is present in the list of collection.

23	elementAtOrNull()
Returns an element at the given index or null if the index is out of bounds of this array.

24	filter()
Returns a list containing only elements matching the given predicte.

25	filterNot()
Returns a list containing all elements not matching the given predicate.

26	filterNotNull()
Returns a list containing all elements that are not null.

27	find()
Returns the first element matching the given predicate, or null if no such element was found.

28	findLast()
Returns the last element matching the given predicate, or null if no such element was found.

29	first()
Returns the first element.

30	flatten()
Returns a single list of all elements from all array in the given array.

31	forEach()
Performs the given action on each elements.

32	getOrElse()
Returns an element at the given index or the result of calling the defaultValue.

33	getOrNull()
Returns an element at the given index or null if the index is out of bounds of this array.

34	groupBy()
Groups elements of original array by the key returned by the given keyslector function.

35	indexOf()
Returns first index of element, or -1 if the array does bot contain element.

36	indexOfFirst()
Returns index of the first element matching the given predicate, or -1 if the array does not contain such element.

37	indexOfLast()
Returns index of the last element matching the given predicate, or -1 if the array does not contain such element.

38	intersect()
Returns a set containing all elements that are contained by both this array and the specified collection.

39	isEmpty()
Returns ture if the array is empty.

40	isNotEmpty()
Returns true if the array is not empty.

41	isNullOrEmpty()
Returns true if this nullable array is either null or empty.

42	joinTo()
Appends the string from all the elements separated using separator.

43	joinToString()
Creates a string from all the elements separated using separator.

44	lastIndexOf()
Returns last index of element, or -1 if the array does not contain element.

45	lastOrNull()
Returns the last element, or null if the array is empty.

46	map()
Returns a list containing the results of applying the given transform function to each element in the original array.

47	maxOf()
Returns the largest value among all values produced by selector function.

48	minOf()
Returns the smallest value among all values produced by selector function.

49	none()
Returns true if the array has no elements.

50	partition()
Splits the original array into pair of lists.

51	random()
Returns a random element from this array.

52	randomOrNull()
Returns a random element from this array, or null if this array is empty.

53	reduce()
Helps to convert elements of an array into a single result.

54	reduceRight()
Accumulates value starting with the last element and applying operation from right to left to each element and current accumulator value.

55	reverse()
Reverses elements in the array in-place.

56	reversed()
Returns a list with elements in reversed order.

57	runningReduce()
This function is used to perform a successive accumulation operation on an array.

58	shuffle()
Randomly shuffles elements in this array in-place.

59	single()
Returns the single element, or throws an exception if the array is empty or has more than one element.

60	slice()
Returns a list containing elements at indices in the specified indices range.

61	sliceArray()
Returns an array containing elements of this array at specified indices.

62	sortBy()
Sorts elements in the array in-place according to natural sort order of the value returned by specified selector function.

63	sortByDescending()
Sorts elements in the array in-place descending according to natural sort order of the value returned by specified selector function.

64	sortDescending()
Sorts elements in the array in-place descending according to natural sort order.

65	sorted()
Returns a list of all elements sorted according to their natural sort order.

66	sortedArray()
Returns an array with all elements of this array sorted according to their natural sort order.

67	sortedArrayDescending()
Returns an array with all elements of this array sorted descending according to their natural sort order.

68	sortedBy()
Returns a list of all elements sorted according to natural sort order of the value returned by specified selector function.

69	sortedByDescending()
Returns a list of all elements sorted descending according to natural sort order of the value returned by specified selector function.

70	sortedDescending()
Sorts the array's element or collection in descending order according to the natural order.

71	sortedWith()
Sorts the array's element or collection in to the sorted order according to the specified comparator or condition.

72	sortWith()
Sorts the array's element or collection in a given range according to the order specified by the given comparator or condition.

73	subtract()
Removes all elements from the first array that match elements in the second array.

74	sum()
Returns the sum of all elements of the array and collection.

75	sumOf()
Displays the total of all array and collection items using a selector function applied to each element of the collection.

76	take()
Returns a list containing first n elements.

77	takeLast()
Returns a list containing last n elements.

78	takeLastWhile()
Returns a list containing last elements satisfying the given predicate.

79	takeWhile()
Returns a list containing first elements satisfying the given predicate.

80	toList()
Returns a List containing all elements.

81	toSet()
Returns a Set of all elements.

82	union()
Returns a set containing all distinct elements from both collections.
* */