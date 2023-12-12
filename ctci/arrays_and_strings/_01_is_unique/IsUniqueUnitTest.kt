package ctci.arrays_and_strings._01_is_unique

import org.junit.Assert
import org.junit.Test

/**
 * Unit Test cases for IsUnique.hasUniqueCharacters()
 */
class IsUniqueUnitTest {

    @Test
    fun testIsUniqueUnique() {
        Assert.assertEquals(true, IsUnique().hasUniqueCharacters("github"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharacters("kotlin"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharacters("coding"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharacters("android"))
    }

    @Test
    fun testIsUniqueNonUnique() {
        Assert.assertEquals(false, IsUnique().hasUniqueCharacters("interview"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharacters("linkedin"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharacters("developer"))
    }

    @Test
    fun testIsUniqueEmptyString() {
        Assert.assertEquals(true, IsUnique().hasUniqueCharacters(""))
    }

}