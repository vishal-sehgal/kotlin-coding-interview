package ctci.arrays_and_strings._01_is_unique

import org.junit.Assert
import org.junit.Test

/**
 * Unit Test cases for IsUnique functions.
 */
class IsUniqueUnitTest {

    @Test
    fun testIsUniqueUnique() {
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBetter("github"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBetter("kotlin"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBetter("coding"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBetter("android"))

        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBest("github"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBest("kotlin"))
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBest("coding"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBest("android"))
    }

    @Test
    fun testIsUniqueNonUnique() {
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBetter("interview"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBetter("linkedin"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBetter("developer"))

        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBest("interview"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBest("linkedin"))
        Assert.assertEquals(false, IsUnique().hasUniqueCharactersBest("developer"))
    }

    @Test
    fun testIsUniqueEmptyString() {
        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBetter(""))

        Assert.assertEquals(true, IsUnique().hasUniqueCharactersBest(""))
    }

}