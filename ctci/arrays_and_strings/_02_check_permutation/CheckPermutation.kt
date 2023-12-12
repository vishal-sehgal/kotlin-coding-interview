package ctci.arrays_and_strings._02_check_permutation

/**
 * #1.2
 *
 * Check Permutation: Given two strings, write a method to decide if one is a permutation
 * of the other.
 */

class CheckPermutation {

    /**
     * Determines whether two given strings are permutations of each other.
     *
     * Time Complexity: O(n), where n is the length of the input strings.
     *
     * @param string1 The first string to be checked for permutation.
     * @param string2 The second string to be checked for permutation.
     * @return `true` if the strings are permutations, `false` otherwise.
     */
    fun arePermutationsSolutionOne(string1: String, string2: String): Boolean {
        if ((string1.length != string2.length))
            return false

        val charCount = mutableMapOf<Char, Int>()

        string1.forEach {
            charCount[it] = charCount.getOrDefault(it, 0) + 1
        }

        return string2.all {
            charCount[it]?.let { count ->
                count > 0 && charCount.put(it, count - 1) != null
            } ?: false
        }
    }

    /**
     * Time Complexity: O(n), where n is the length of the input strings.
     */
    fun arePermutationsSolutionTwo(string1: String, string2: String): Boolean {
        if (string1.length != string2.length) return false

        return stringToCountMap(string1) == stringToCountMap(string2)
    }

    /**
     * Converts a string into a character count map.
     *
     * This function takes a string as input and creates a mutable map where each character
     * in the string is a key, and the corresponding value is the count of occurrences of that character.
     * It iterates through the characters of the string, updating the count in the map accordingly.
     *
     * @param string The input string to be converted into a character count map.
     * @return A mutable map with characters as keys and their counts as values.
     */
    private fun stringToCountMap(string: String): MutableMap<Char, Int> {
        val charCount = mutableMapOf<Char, Int>()
        string.forEach {
            charCount[it] = charCount.getOrDefault(it, 0) + 1
        }
        return charCount
    }
}

fun main() {
    val string1 = "abc"
    val string2 = "cab"
    val string3 = "bca"
    println("Are $string1 & $string2 Permutations? ${CheckPermutation().arePermutationsSolutionOne(string1, string2)}")
    println("Are $string1 & $string2 Permutations? ${CheckPermutation().arePermutationsSolutionTwo(string1, string2)}")

    println("Are $string2 & $string3 Permutations? ${CheckPermutation().arePermutationsSolutionOne(string2, string3)}")
    println("Are $string2 & $string3 Permutations? ${CheckPermutation().arePermutationsSolutionTwo(string2, string3)}")
}