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

    println("String: $string1 has all unique characters: ${IsUnique().hasUniqueCharacters(string1)}")
    println("String: $string2 has all unique characters: ${IsUnique().hasUniqueCharacters(string2)}")
    println("String: $string3 has all unique characters: ${IsUnique().hasUniqueCharacters(string3)}")
    println("String: $string4 has all unique characters: ${IsUnique().hasUniqueCharacters(string4)}")
}

class IsUnique {

    /**
     * Determines whether a given string has all unique characters.
     *
     * Time complexity: O(n), where n is the number of characters in the string.
     *
     * @param string The input string to be checked for unique characters.
     * @return `true` if all characters in the string are unique, `false` otherwise.
     */

    fun hasUniqueCharacters(string: String): Boolean {
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