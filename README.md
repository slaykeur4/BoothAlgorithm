BoothAlgorithm
==============

Java implementation of Booth's multiplication algorithm and the modified Booth algorithm

The program takes binary numbers of size 8, so the possible values are 28= 256. The input ranges from -127 to 128.

Booth’s algorithm is good for sequences of 3 or more 1s because it Replaces 3 (or more) additions with 1 add and 1 subtraction. For sequences of 2 1s, there isn’t much gain because it Replaces 2 additions with 1 addition and 1 subtraction (add = subtract). The algorithm performs badly for the case of singleton 1s because it Replaces 1 addition with 1 addition and 1 subtraction. The Worst case multiplier (101010) requires N/2 additions + N/2 subsractions.
The solution to that comes with the modified booth’s algorithm. The algorithm detects singletons by examining multiplier bits in groups of 2s plus a helper bit on the right, as opposed to 1 bit plus helper bit on right. This means that we’ll need to shift product/multiplier by 2. However, the number of bits of the values must be even.
