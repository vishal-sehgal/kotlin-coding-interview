package ctci.arrays_and_strings._01_is_unique

/**
 * #1.1
 *
 * Is Unique: Implement an algorithm to determine if a string has all unique characters.
 * What if you can not use additional data structures?
 */

fun main() {
    val string1 = "vishal"
    val string2 = "sehgal"
    val string3 = "linkedin"
    val string4 = "google"

    println("String: $string1 has all unique characters: ${IsUnique().hasUniqueCharactersBetter(string1)}")
    println("String: $string2 has all unique characters: ${IsUnique().hasUniqueCharactersBetter(string2)}")
    println("String: $string3 has all unique characters: ${IsUnique().hasUniqueCharactersBetter(string3)}")
    println("String: $string4 has all unique characters: ${IsUnique().hasUniqueCharactersBetter(string4)}")
    println()
    println("String: $string1 has all unique characters: ${IsUnique().hasUniqueCharactersBest(string1)}")
    println("String: $string2 has all unique characters: ${IsUnique().hasUniqueCharactersBest(string2)}")
    println("String: $string3 has all unique characters: ${IsUnique().hasUniqueCharactersBest(string3)}")
    println("String: $string4 has all unique characters: ${IsUnique().hasUniqueCharactersBest(string4)}")

}

class IsUnique {

    /**
     * Determines whether a given string has all unique characters.
     *
     * Time complexity: O(n), where n is the length of input string.
     *
     * Here's a breakdown of the time complexity:
     *
     * string.toSet(): This converts the string to a set, which involves iterating through each
     * character in the string to build the set. In the worst case, this operation has a time complexity of O(n),
     * where n is the length of the string.
     *
     * string.length == string.toSet().size: This checks if the length of the original string is equal
     * to the size of the set. The size operation on a set is typically a constant-time operation.
     *
     * Therefore, the dominant factor in determining the time complexity is the conversion of the string
     * to a set, resulting in a total time complexity of O(n), where n is the length of the input string.
     * The function's runtime scales linearly with the size of the input.
     *
     *
     * @param string The input string to be checked for unique characters.
     * @return `true` if all characters in the string are unique, `false` otherwise.
     */
    fun hasUniqueCharactersBest(string: String) = string.length == string.toSet().size


    /**
     * Determines whether a given string has all unique characters.
     *
     * Time complexity: O(n), where n is the length of input string.
     *
     * Here's a breakdown of the time complexity:
     *
     * string.toSet(): This converts the string to a set, which involves iterating through each character in the string to build the set. In the worst case, this operation has a time complexity of O(n), where n is the length of the string.
     *
     * str.length == str.toSet().size: This checks if the length of the original string is equal to the size of the set. The size operation on a set is typically a constant-time operation.
     *
     * Therefore, the dominant factor in determining the time complexity is the conversion of the string to a set, resulting in a total time complexity of O(n), where n is the length of the input string. The function's runtime scales linearly with the size of the input.
     *
     *
     * @param string The input string to be checked for unique characters.
     * @return `true` if all characters in the string are unique, `false` otherwise.
     */
    fun hasUniqueCharactersBetter(string: String): Boolean {
        //Assuming ASCII character set (8-bit)
        //The string can not have all unique characters if it's length is greater than 128
        if (string.length > 128) {
            return false
        }

        val charSet = BooleanArray(128)

        for (char in string) {
            val index = char.code
            if (charSet[index]) {
                return false
            }
            charSet[index] = true
        }

        return true // All char are unique.
    }

}